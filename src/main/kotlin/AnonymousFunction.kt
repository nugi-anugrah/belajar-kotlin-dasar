fun main() {
    fun hello(name: String, transformer:(String) -> String): String {
        val nameTransformer = transformer(name)
        return "Hello $nameTransformer"
    }
    val upper = fun (value:String):String {
        if (value=="") {
            return "Ups"
        } else {
            return value.toUpperCase()
        }
    }

    println(hello("Nugi", upper))
    println(hello("",upper))

    println(hello("Anugrah",fun(value:String): String{
        return value.toLowerCase()
    }))
}