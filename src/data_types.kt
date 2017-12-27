/**
 * Tipos de datos en kotlin
 */

/* las variables se pueden declarar con val o con var,
 * siendo var la más común.
 * Cuando se declara con val es similar a declarar algo como final
 */

val int = 123
val long = 123456L // Se necesita poner la L para especificar el tipo
val double = 12.345
val float = 12.345F // Igual se tiene que poner la F
val hexadecimal = 0xAB  // prefijo 0x
val binario = 0b01010101  // prefijo 0b
val boolean = true
val string = "Hola mundo" // los string son objetos inmutables como en Java

// Como en kotlin no hay tipos primitivos, los números también son un objeto

fun main(args: Array<String>) {
    println(int.toLong())
    println(string)
    println(boolean)
}