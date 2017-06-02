# Tipos de datos

Existen distintos tipos de datos básicos, con los que realizar las diversas operaciones en nuestros programas:

* String
* Char
* Boolean
* Array

Y con respecto a numéricos:

* Double
* Float
* Long
* Int
* Short
* Byte

# Sintaxis

## Declaración de variables

Para almacenar datos con los que operaremos, usaremos las variables. Estas no necesitan de especificar un tipo cuando son creadas, pero se le infiere una vez se le asigna un valor.

```kt
// Variable inicializada con declaración de tipo
val edad : Int = 24

// Variable sin declaración de tipo y sin inicializar en la línea de declaración
val nombre
nombre = "Elena"

// Variable inicializada con tipo Boolean inferido
val programaEnKotlin = true
```

## Comentarios

Para explicar lo que no podemos expresar en código, siempre existirán nuestros amados comentarios. Y como siempre, los de línea única:

```kt
// ¡Un comentario!
```

Y los multilínea:

```kt
/*
    Comentario en varias líneas
    para documentación variada
*/
```

## Creación de funciones

Crear una función es muy sencillo, su sintaxis es muy simple. Determinar la declaración de la función, el nombre de la misma y el parámetro que va a recibir, junto con el tipo de dato (en notación Pascal).
Después, el código que va a ejecutar, sin especificar qué tipo de dato va a devolver la función en inicio.

```kt
fun mostrarNombre(nombre: String)
{
    println(nombre)
}
```

Hay algunas funciones que son tan sencillas que, a base de condicionales, se pueden resolver en una sola línea de código. En el caso de determinar si una persona es mayor o menor de edad, el código es muy sencillo.

```kt
fun esMayorDeEdad(edad: Int)
{
    if (edad >= 18) true else false
}
```

Algunas funciones tienen o necesitan valores por defecto en los parámetros que reciben. Podemos entonces suprimir su mención cuando lo invocamos, dependiendo de las circunstancias.

```kt
fun definirPersona(nombre: String, edad: Int = 18)
{
    println("Nueva persona de nombre $nombre y con $edad años")
}
```

Por lo que su invocación podría ser:

```kt
definirPersona("Ethan")
definirPersona("Elena", 20)
```

Si necesitamos una función que devuelva un tipo de dato concreto, podemos seguir el ejemplo:

```kt
fun enviarSaludo(nombre: String) : String
{
    val saludo = "Bienvenidx, $nombre"
    return saludo
}

println(enviarSaludo("Elena"))
```

## Clases y propiedades

La declaración de Clases se simplifica de tal modo que en el mismo nombramiento se define el constructor y los parámetros que va a utiizar.

```kt
class Persona (val id: String, val nombre: String)
val nuevaPersona = Persona("001", "Elena G")

println(nuevaPersona.nombre)

```

## Enumeraciones

De un modo similar a como lo veríamos en C#, crear enumeraciones es posible. Se crea un nuevo tipo de dato que contiene otros datos, figuras concretas, como por ejemplo, géneros de ficción en el cine.

```kt
enum class GenerosCine {
    CienciaFiccion, Fantasia, Accion, Terror
}

println(GenerosCine.CienciaFiccion)

```
