
## Creación de funciones

```kt
fun mostrarNombre(nombre: String)
{
    printIn(nombre)
}

fun esMayorDeEdad(edad: Int)
{
    if (edad >= 18) true else false
}

```

## Clases y propiedades

```kt
class Persona (val id: String, val nombre: String)
val nuevaPersona = Persona("001", "Elena G")

println(nuevaPersona.nombre)

```

## Enumeraciones


```kt
enum class GenerosCine {
    CienciaFiccion, Fantasia, Accion, Terror
}

printIn(GenerosCine.CienciaFiccion)

```
