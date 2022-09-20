const val APP = "Belajar Kotiln"
const val VERSION = "0.0.1"

fun main() {

    val firstName : String = "Nugi"
    val age = 30

    println(firstName)
    println(age)

    var name : String? = null
    name = "Nugi"

    println(name)
    println(name?.length)
    println("$APP : $VERSION")
}