import jdk.incubator.vector.Float16.multiply
import javax.naming.Name

fun main() {
    add()
    val res : Int = sub()
    println("The value is $res")
    val multi : Int = mul(2, 2)
    println("Multiplication: $multi")
    val multi2 : Int = mul(5, 2)
    println("Multiplication: $multi2")
    namedDefault(name = "Hasan", age = 18)

    println("Higher Order Function:")
    higherOrder(6, 6) { myRes ->
        println(myRes)
    }

    higherOrder2(6, myTul = {
        println(it)
    }, 4)

    higherOrder3(2, myTul = { myAge, myName ->
        println("$myAge $myName")
    } ,2)

    higherOrder4(1, myTul2 = {myR, myN ->
        println("$myR $myN")
        myR + 12
    },2)

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

fun namedDefault(name: String, age: Int = 0) {
    println("Name: $name, Age: $age")
}

//higher order function lambda example
fun higherOrder (i: Int, j: Int, myOrder: (Int) -> Unit) {
    val res = i + j
    myOrder(res)
}

fun higherOrder2 (i: Int, myTul: (Int) -> Unit, j: Int) {
    val res = i + j
    myTul(res)
}

fun higherOrder3 (i: Int, myTul: (Int, String) -> Unit, j: Int) {
    val res = i + j
    myTul(res, "Hasan")
}

fun higherOrder4 (i: Int, myTul2: (Int, String) -> Int, j: Int) {
    val res = i + j
    val tul = myTul2(res, "Hasan")
    println(tul)
}
