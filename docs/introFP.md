# Introducción a la programación funcional

La programación funcional o _functional programming_ es el proceso de desarrollo que se basa en funciones puras, evitando el estado compartido, _mutable data_ y efectos colaterales.
Es un estilo de programación declarativa, no imperativa.
Es un paradigma de la programación.

Tiende a ser un código más conciso, predecible y más fácil de testear que el código imperativo o el código de programación orientada a objetos.

Aprender la programación funcional te cambia *para siempre*, es reaprender el modo en que programamos y desarrollamos. Es como empezar de cero (_pun intended_, en programación siempre empezamos a contar desde cero). Requerirá tiempo, así que paciencia. Dejemos atrás la limitante programación imperativa y abre las alas con la programación funcional (?).


## Conceptos clave

* Funciones puras
* Inmutabilidad, evitando _side effects_
* Refactorización optimizada
* _Function composition_
* Evitar estados compartidos

### La pureza de las funciones

Una función pura es:

* Aquella que teniendo el mismo _input_, tiene el mismo _output_
* No tiene efectos colaterales

Como ejemplo de una función pura:

```js
var z = 10;
function add(x, y) {
    return x + y;
}
```

Una variable y una función que no toca la primera variable. Las funciones puras SOLO operan con sus parámetros. Si leyese o escribiese sobre la variable `z`, dejaría de ser pura.

Otro ejemplo a considerar:

```js
function devuelveDiez() {
    return 10;
}
```

Siguiendo los requisitos para crear una función pura, con el mismo _input_ recibiremos el mismo _output_, si la función no recibe parámetros debe entonces devolver una constante, el mismo valor de forma eterna.

Las funciones puras deben devolver algo para resultar útiles. Pero en el momento en que cambian valores externos, variables externas, se convierten en funciones impuras. Las siguientes funciones o métodos se consideran impuros:

```js
escribirFichero(nombreFichero);
actualizarTabla(comandoSQL);
enviarRequestAjax(ajaxRequest);
abrirSocket(direccionIP);
```

Estas "repercusiones" sobre otras variables, sobre otros datos, son los que se llaman _side effects_ o efectos colaterales. Hacen más que operar con sus _inputs_ y devolver _outputs_. Esto sucede constantemente en la programación imperativa, donde una variable puede ser cambiada en literalmente cualquier lugar (si el _scope_ y el acceso lo permite, claro está). Cuando testeas y buscas errores... ¿dónde vas a buscar? ¿En qué parte de tu código exactamente?

Es imposible eliminar por completo los _side effects_, pero los puedes confinar o reducir a la mínima expresión. En programas que interactúan con otros muchos y se integran en la vida real, habrá mucho código impuro, pero podemos segregarlo del resto de nuestro programa.

### Inmutabilidad

Es la propiedad que marca a las variables, que permanecerán con ese nombre por motivos históricos, como cajones de valores que no cambiarán. Constantes.

Tampoco se hace uso de los tradicionales bucles, instrucciones como `for`, `do-while`, `repeat`... no existen. Para realizar bucles, la programación funcional acude a la recursividad. Pueden ser más difíciles de proyectar, pero la solución son los bucles `for, que caen inevitablemente en la mutabilidad.

Tienen muchas propiedades para la FP, como la transparencia referencial, que indica que puedes reemplazar la llamada de una función con su respectivo valor sin que esto cambie el significado del programa.
La _function composition_ es el proceso de combinar dos o más funciones en orden de crear una nueva función o conseguir una nueva computación.

### "Las cosas que se hacen por refactorización..."

```js
function validateSsn(ssn) {
    if (/^\d{3}-\d{2}-\d{4}$/.exec(ssn))
        console.log('Valid SSN');
    else
        console.log('Invalid SSN');
}
function validatePhone(phone) {
    if (/^\(\d{3}\)\d{3}-\d{4}$/.exec(phone))
        console.log('Valid Phone Number');
    else
        console.log('Invalid Phone Number');
}
```

Estas dos funciones se pueden resumir en:

```js
function validateValue(value, regex, type) {
    if (regex.exec(value))
        console.log('Invalid ' + type);
    else
        console.log('Valid ' + type);
}
```

¿Y si, además del `value` a considerar, también necesitaremos elegir la función a ejecutar? ¿Podría ser que las funciones puedan ser incluidas como parámetros de una función? La respuesta es sí.

Existen además, funciones que reciben funciones que reciben funciones como parámetros y/o devuelven funciones como resultados. Reciben el nombre de _High-order functions_. Las funciones _high-order_, para comodidad en la programación, puedes incluso ser almacenadas en variables:

```js
unction makeRegexParser(regex) {
    return regex.exec;
}

var parseSsn = makeRegexParser(/^\d{3}-\d{2}-\d{4}$/);
var parsePhone = makeRegexParser(/^\(\d{3}\)\d{3}-\d{4}$/);

validateValueWithFunc('123-45-6789', parseSsn, 'SSN');
validateValueWithFunc('(123)456-7890', parsePhone, 'Phone');
validateValueWithFunc('123 Main St.', parseAddress, 'Address');
validateValueWithFunc('Joe Mama', parseName, 'Name');
```

El objetivo de este código es *no olvidar la función `exec` para cada expresión regular con la que vayamos a operar. Una vez almacenadas, simplemente deben ser invocadas como parámetros para las funciones que van a realizar toda la magia de validar datos.

Como ejemplo de una función que devuelve una función:

```js
function makeAdder(constantValue) {
    return function adder(value) {
        return constantValue + value;
    };
}
```

### _Closure_

Un _closure_ es el modo en que el alcance o _scope_ de una función se mantiene vivo gracias a las referencias a esa función.

`A ampliar`

### _Function composition_

Perseguimos la reutilización del código, optimizando su uso. Porque si escribes un código demasiado específico, se convierte en algo imposible de reutilizar. Si lo haces demasiado generalista, será muy complicado de implementar en cualquier proyecto o situación.

Buscaremos el equilibrio, creando piezas pequeñas y reutilizables que se pueden utilizar como piezas de Lego en nuestros proyectos.

### Programación reactiva, _reactive programming_

Si quieres saber más, visita [RxMarbles](http://rxmarbles.com/)

#### Referencias

* [What is functional programming](https://medium.com/javascript-scene/master-the-javascript-interview-what-is-functional-programming-7f218c68b3a0)
* [So You Want to be a Functional Programmer (Part 1)](https://medium.com/@cscalfani/so-you-want-to-be-a-functional-programmer-part-1-1f15e387e536)
* [So You Want to be a Functional Programmer (Part 2)](https://medium.com/@cscalfani/so-you-want-to-be-a-functional-programmer-part-2-7005682cec4a)
* [So You Want to be a Functional Programmer (Part 3)](https://medium.com/@cscalfani/so-you-want-to-be-a-functional-programmer-part-3-1b0fd14eb1a7)
* [A practical introduction to functional programming](https://maryrosecook.com/blog/post/a-practical-introduction-to-functional-programming)
