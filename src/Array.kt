fun main() {
    val myArray : Array<String> = arrayOf("Rakib","Kamal","Hasan")
    val anyArray : Array<Any> = arrayOf('R',true,"Hasan", 10.0)

    for (i in myArray) {
        println(i)
    }

    for (i in myArray.size - 2 downTo 0) {
        println(i)
    }
    println(myArray.contentToString())

    for ((index, name) in anyArray.withIndex()) {
        println("$index : $name")
    }

    val intArray : IntArray = intArrayOf(1, 2, 3)
    val intArray2 = intArrayOf(1, 2, 3)
    println(intArray[2])
    println(intArray2.contentToString())
}