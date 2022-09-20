fun String.hello(): String = "Hello $this"

fun main() {
    val name = "Nugi"

    println(name.hello())
}
