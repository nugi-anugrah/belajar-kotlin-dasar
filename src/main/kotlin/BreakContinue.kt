fun main() {
    var i = 0
    while (true) {
        println("Break Me $i")
        i++
        if (i >1000){
            break
        }
    }

    val x = 0

    for (x in 1..1000){
        if (x % 2 == 0){
            continue
        }
        println(x)
    }
}