/**
 * Ejemplo de creación de arreglos
 */


// Definir un arreglo sin especificar el tipo
val array = arrayOf(1, 2, 3)

// Declarar un arreglo con longitus definida y con una funcion para generar los elementos
val array2 = Array(10, {k -> k * k})

// Arreglos de los diferentes tipos de datos
val intArray = intArrayOf(1, 2, 3)
val longArray = longArrayOf(1L, 2L, 3L)

// Arreglo vacio de tipos
val arrayInt = IntArray(10)
val arrayChar = CharArray(50)


/**
 * Ejemplo de rangos
 */

val aToZ = "a".."z"
val oneToNine = 1..9

// clausula 'in'
val isTrue = "c" in aToZ
val irFalse = 11 in oneToNine

// usando métodos de los números
val rangeTo = 0.rangeTo(100)
val down = 100.downTo(0)
val steps = oneToNine.step(2)
val reverse = oneToNine.reversed()
