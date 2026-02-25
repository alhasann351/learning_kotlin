fun main(){
    var num = 10

    if(num > 15){
        println("yes")
    }else{
        println("no")
    }

    if(num in 5..15){
        println("yes")
    }else{
        println("no")
    }

    var name = "Hasan"
    when(name){
        "Rakib" -> {println("This is Rakib")}
        "Kamal" -> {println("This is Kamal")}
        "Hasan" -> {println("This is Hasan")}
        else -> {println("Invalid Input")}
    }

}