# Expresiones lambda

Son funciones anónimas, sin nombre y sin referencias a clases. Su operador, `->`, es el que divide el cuerpo de la función, de la expresión lambda de sus parámetros.
Los parámetros son el primer elemento, y si solo hay uno no hace falta incluir los paréntesis que los enmarcan.
El cuerpo de la expresión, o de la función, está enmarcado por corchetes, `{}`. Si solo hay una línea en la expresión, los corchetes no son necesarios.
Si solo hay una línea en el cuerpo de la expresión, no es necesario especificar la instrucción `return`.

Ejemplos:

```
z -> z + 2

() -> System.out.println(” Mensaje 1 “)

(int longitud, int altura) -> { return altura * longitud; }

(String x) -> { String retorno = x;
  retorno = retorno.concat(” ***”);
  return retorno; }
```

Las expresiones lambda pueden ser utilizadas donde el tipo que se acepta es un interfaz funcional.
Un interfaz funcional es un interfaz con un único método que resulta ser abstracto.
Puede tener una anotación, opcionalmente, como `@FunctionalInterface`.

## Clasificaciones

* Consumidores
* Proveedores
* Funciones
* Predicados

### Consumidores

Reciben un solo parámetro y no devuelven valor. Consumen un solo valor pero sin devolver nada, como podría ser lanzar mensajes por consola/pantalla.

### Proveedores

No reciben parámetros y devuelven resultados, devuelven valores. No consumen, solo proveen de resultados.

### Funciones

Reciben parámetros y devuelven un valor, no necesariamente iguales entre ambos elementos. Peden recibir varios parámetros y un resultado.
Existen dos casos "particulares" en estas expresiones llamadas funciones:

* Operadores unarios: recibe un parámetro y devuelve un valor, siendo ambos del mismo tipo
* Operadores binarios: recibe dos parámetros y devuelve un valor, siendo los tres del mismo tipo

### Predicados

Reciben un parámetro y devuelven un valor lógico, como puede ser un `boolean`.

## Referencias a métodos

Es el modo en que se reutilizan los métodos con expresiones lambda. Tiene una sintaxis específica, que se puede resumir en `Clase:::llamadaMetodo`.

Existen tres tipos diferentes:

* Métodos estáticos
* Métodos de instancia de un tipo
* Métodos de instancia de un objeto existente

_A ampliar con ejemplos_

## Uso de lambdas

_A ampliar con ejemplos_

#### Referencias

* [Kotlin: funciones Lambda, adiós al código duplicado](https://betabeers.com/blog/kotlin-funciones-lambda-adios-al-codigo-duplicado-androidmeetskotlin-325/)
* [Expresiones lambda con Java8](https://www.adictosaltrabajo.com/tutoriales/expresiones-lambda-con-java-8/)
