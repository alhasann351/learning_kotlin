class Student {
    var name : String = ""
    var age : Int = 0

    fun printStudentInfo () {
        println("Name: $name \nage: $age")
    }
}

fun main () {
    var student1 = Student()
    student1.name = "Hasan"
    student1.age = 18
    student1.printStudentInfo()

    var student2 = Student()
    student2.name = "Kamal"
    student2.age = 50
    student2.printStudentInfo()
}