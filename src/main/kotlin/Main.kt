fun imprimirVelas(edad: Int): String {
    var mensaje: String = ""
    var contador: Int = 1
    while(contador <= edad) {
        mensaje += "'"
        contador++
    }
    contador = 1
    mensaje += "\n"
    while(contador <= edad) {
        mensaje += "|"
        contador++
    }
    return mensaje
}
fun imprimirCapaSup(edad: Int): String {
    var mensaje: String = ""
    var contador: Int = 1
    while (contador <= edad) {
        mensaje += "="
        contador++
    }
    return mensaje
}
fun imprimirCapasInf(edad: Int, numCapas: Int): String {
    var prim: String = ""
    var contador = 1
    while (contador <= edad) {
        prim += "@"
        contador++
    }
    var mensaje: String = ""
    contador = 1
    while (contador <= numCapas) {
        mensaje += "$prim\n"
        contador++
    }
    return mensaje
}
fun imprimirMensaje(mensaje: String): String {
    var message: String = "\"-._.-\""
    return message.repeat(5) + "\n $mensaje \n" + message.repeat(5)
}


fun main() {
    println(imprimirVelas(30))
    println(imprimirCapaSup(30))
    println(imprimirCapasInf(30,5))
    println(imprimirMensaje("¡¡Feliz Feliz en tu diaa!!"))
}