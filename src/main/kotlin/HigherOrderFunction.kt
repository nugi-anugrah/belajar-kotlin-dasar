fun main() {
///////////////////////////////////Higher-Order Function
    fun hello(name: String, transformer:(String) -> String): String {
        val nameTransformer = transformer(name)
        return "Hello $nameTransformer"
    }

    val lambdaUpper = { value : String -> value.toUpperCase()}
    println(hello("Nugi", lambdaUpper))

    println(hello("Nugi", {value : String -> value.toLowerCase()}))

//////////////////////////////////Trailing Lambda
    val result1 = hello("Nugi", {value: String -> value.toLowerCase()})
    val result2 = hello("Eko") {value : String ->
        value.toLowerCase()
    }

}