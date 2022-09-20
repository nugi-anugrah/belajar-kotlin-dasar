fun toUpper(value:String): String = value.toUpperCase()

fun main() {
//////////lambda
    val contohLambda: (String,String) -> String = {firstName: String, lastName: String ->
        val x=firstName.toUpperCase()
        val y: String=lastName.toUpperCase()
        val result="$x $y"
        result
    }
////////////////////////it
    val result = contohLambda("Nugi", "Anugrah")
    println(result)

    val sayHello: (String) -> String ={
        "Hello $it"
    }

    println(sayHello("Nugi"))
/////////////////////////Method Reference

    val toUpperCase : (String) -> String = ::toUpper
    println(toUpperCase("Nugi Anugrah"))
}