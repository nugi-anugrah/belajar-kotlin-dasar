fun main() {
    val finalExam = 'A'
    val passValue = arrayOf('A','B','C')
    when (finalExam) {
    /*'A' -> println("Amazing")
    'B' -> println("Good")
    'C' -> println("Not Bad")*/
    'A','B','C' -> println("Congratulation")
    else -> println("Tray again next years")
    }

    when (finalExam){
        in passValue -> println("Selamat Anda Lulus")
        !in passValue -> println("Maaf, Harap Coba Lagi")
    }

    val name = "Nugi"
    when (name){
        is String -> println("Name is String")
        !is String -> println("Name is not String")
    }

    val nilaiUjian =90
    when{
        nilaiUjian >90 -> println("Amazing")
        nilaiUjian >80 -> println("Good Job")
        nilaiUjian >70 -> println("Not Bad")
    }
}

