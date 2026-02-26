fun main() {
    var battery = 5
    var age = 10
    var age2 = 5
    var names = listOf("Hasan", "Rakib", "Kamal", "Hasan", "Kamal")

    println("While Loop:")
    while (battery >= 0) {
        println("Battery remaining: $battery%")
        battery--
    }

    println()
    println("Do While Loop:")

    do {
        println("Age is $age")
        age--
    } while (age >= age2)

    println()
    println("For Loop:")

    for (name in names) {
        println(name)
    }

    println()
    println("For Loop 2:")

    for ((index, name) in names.withIndex()) {
        println("Index: $index-> Name: $name")
    }

    println()
    println("Jump Statements Break:")

    for (i in 1..10) {
        if (i == 3) {
            println("Break value: $i")
            break
        }
        println(i)
    }

    println()
    println("Jump Statements Continue:")

    for (i in 1..10) {
        if (i == 5) {
            println("Continue value: $i")
            continue
        }
        println(i)
    }

    println()
    println("Jump Statements Return:")

    val personName : Array<String> = arrayOf("Hasan", "Rakib", "Kamal", "Hasan", "Kamal")
    personName.forEach {
        if (it == "Hasan") {
            return@forEach
        }
        println(it)
    }

    println()
    println("Jump Statements Return Break:")

    val value : Array<Any> = arrayOf("Rakib", 'K', 10, true)
    run value@{
        value.forEach {
            if (it == 10) {
                return@value
            }
            println(it)
        }
    }

}