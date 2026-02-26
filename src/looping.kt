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
}