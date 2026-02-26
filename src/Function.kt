import jdk.incubator.vector.Float16.multiply

fun main() {
    add()
    val res : Int = sub()
    println("The value is $res")
    val multi : Int = mul(2, 2)
    println("Multiplication: $multi")
    val multi2 : Int = mul(5, 2)
    println("Multiplication: $multi2")
}

fun add() {
    val a : Int = 10
    val b : Int = 20
    val c : Int = a + b
    println("The value is $c")
}

fun sub() : Int {
    val a : Int = 10
    val b : Int = 20
    val c : Int = a - b
    return c
}

fun mul(a: Int, b: Int) : Int {
    val c : Int = a * b
    return c
}