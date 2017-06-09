fun main(args: Array<String>) {
    val nombre = "aweDev"
    val edad = 120
    
    var edadDoble : Int = 0
    
    edadDoble = edad.toInt() * 2
    
    println("Bienvenido, usuari@, tu nombre es $nombre y tu edad $edad")
    println("El doble de tu edad es " + edadDoble)
    println("Tu nombre de usuario es " + generarUsuario(nombre, edad))
}

fun generarUsuario(n: String, e: Int) : String
{
    return e.toString() + n + e.toString()
}
