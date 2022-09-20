inline fun hello(
    firstName: ()-> String,
    noinline lastName: ()-> String
): String{
    return "hello ${firstName()} ${lastName()}"
}

fun main() {
    for (i in 1..100) {
        println(hello ({ "Nugi" }, { "Anugrah" }))
    }
}
