fun main() {

    val names = arrayOf("Nugi", "Angrah")

    var total = 0
    for (name in names){
        println(name)
        total++
    }
    println("Total perulangan = $total")

    val ukuranNames = names.size - 1
    for (i in 0..ukuranNames){
        println("Index $i = ${names.get(i)}")
    }

}