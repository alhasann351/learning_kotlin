

/*class Student {
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
}*/

/*class Strudent (val name: String, val age: Int) {

    fun info () {
        println("Name: $name Age: $age")
    }
}

fun main() {
    var strudent1 = Strudent("Ama", 18)
    var strudent2 = Strudent("Nma", 32)
    strudent1.info()
    strudent2.info()
}*/

/*class Car {
    var model: String
    var color: String

    constructor(model: String) {
        this.model = model
        this.color = "No color"
    }

    constructor(model: String, color: String) {
        this.model = model
        this.color = color
    }

    fun info () {
        println("Car info: $model color: $color")
    }
}

fun main () {
    val car = Car(model = "My Car")
    car.info()

    val car2 = Car(model = "My Car 2", color = "Yellow")
    car2.info()
}*/

/*open class GPHouse {
    var houseNumber = 1
    var houseName = "GPHouse"

    open fun gPHInfo () {
        println("GPHInfo: $houseNumber, $houseName")
    }
}

open class PHouse : GPHouse() {
    init {
        houseNumber = 2
        houseName = "PHouse"
    }

    override fun gPHInfo() {
        println("PHInfo: $houseNumber, $houseName")
    }
}

class CHouse (types : String) : PHouse() {
    var type = types

    init {
        houseNumber = 4
    }

    override fun gPHInfo() {
        super.gPHInfo()
        println("$houseNumber, $type")
    }
}

fun main () {
    /*var gpHouse = GPHouse()
    gpHouse.gPHInfo()

    var pHouse = PHouse()
    pHouse.gPHInfo()*/

    var cHouse = CHouse(types = "Child House")
    cHouse.gPHInfo()
}*/

class BankAccount {
    private var balance : Double = 0.0
    private var accountHolderName : String = ""

    fun setBalance(amount : Double) {
        if(amount > 0) {
            balance += amount
        }else {
            println("Something went wrong")
        }
    }

    fun getBalance() : Double {
        return balance
    }

    fun setAccountHolderName(name: String) {
        if (accountHolderName.isEmpty()) {
            accountHolderName = name
        }else {
            println("Account Holder Name is empty")
        }
    }

    fun getAccountHolderName() : String {
        return accountHolderName
    }
}

fun main () {
    val bankAccount = BankAccount()
    bankAccount.setAccountHolderName("Hasan")
    println("Account Holder Name: ${bankAccount.getAccountHolderName()}")
    bankAccount.setBalance(12.0)
    println("Balance: ${bankAccount.getBalance()}")
}