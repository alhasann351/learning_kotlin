fun main() {
    var num1 = 10
    var num2 = 20

    //Addition
    var total = num1 + num2
    println(total)

    //Substruction
    var sub = num1 - num2
    println(sub)

    //Multiplication
    var mul = num1 * num2
    println(mul)

    //Division
    var num3: Float = 10f
    var num4: Float = 20f

    var div1: Float = num1.toFloat() / num2.toFloat()
    var div2 = num3 / num4
    println(div1)
    println(div2)

    //Modulus
    var modulus = num1 % num2
    println(modulus)

    println("num1 + num2 = ${num1 + num2}")
}