fun main () {
    //safe call
    val name : String? = null
    println(name?.length)

    //elvis
    println(name?.length ?: -1)

    //Not-null assertion
    println(name!!.length)
}