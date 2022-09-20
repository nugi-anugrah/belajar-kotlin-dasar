fun main() {
    val finalExam =80
    val attendant =80
    val aerobic = 75

    val passFinalExam = finalExam >75
    val passAttendant = attendant >75
    val passAeorbic = aerobic >75

    val apakahLulus = passFinalExam && passAttendant || passAeorbic
    println(apakahLulus)


}