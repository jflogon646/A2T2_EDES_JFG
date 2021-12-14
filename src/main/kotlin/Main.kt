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
fun imprimirMensaje(mensaje: String,edad: Int): String {
    var message: String = "\"-._.-\""
    var repeticiones: Int = edad/7
    return message.repeat(repeticiones) + "\n $mensaje \n" + message.repeat(repeticiones)
    //En la primera versión puse un número fijo de repeticiones
}

fun mensajeCentrado(mensaje: String, edad: Int): String {
    var numCaracteres: Int = (edad - mensaje.length)/2
    return " ".repeat(numCaracteres) + mensaje + " ".repeat(numCaracteres)

}


fun main() {
    print("Escriba la edad de la persona a felicitar: ")
    var edad = readLine()!!.toInt() ?: 16
    print("Escriba el número de capas que desea: ")
    var capas = readLine()!!.toInt() ?: 2
    print("Escriba el mensaje que desea poner en la felicitación: ")
    var mensaje = readLine()!!.toString() ?: "¡¡¡¡ Feliz Cumpleaños !!!!"
    mensaje = mensajeCentrado(mensaje,edad)
    println(imprimirMensaje(mensaje,edad))
    println(imprimirVelas(edad))
    println(imprimirCapaSup(edad))
    println(imprimirCapasInf(edad,capas))
    println(imprimirMensaje(mensaje,edad))
}

