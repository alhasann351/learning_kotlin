fun main() {
    var num1 = 10
    var num2 = 20

    println()
    println("Arithmetic Operators:")
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

    println()
    println("Variable print in one line:")

    println("num1 + num2 = ${num1 + num2}")

    println()
    println("Relational Operators:")

    //Equal to
    println(num1 == num2)

    //Not equal to
    println(num1 != num2)

    //Greater than
    println(num1 > num2)

    //Less than
    println(num1 < num2)

    //Greater than or equal to
    println(num1 >= num2)

    //Less than or equal to
    println(num1 <= num2)

    println()
    println("Logical Operators:")

    //Logical AND
    println(num1 == num2 && num1 < num2)

    //Logical OR
    println(num1 < num2 || num1 == num2)

    //Logical NOT
    println(!(num1 < num2))
}