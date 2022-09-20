fun main() {
    val names : Array<String> = arrayOf("Nugi", "Saipul", "Jamil")
    //names.set(0, "Yoga")
    names[0]="Yoga"
    println(names[0])

    val nilai: Array<Int> = arrayOf(7,8,0)
    println(nilai[0])
    println(nilai[1])
    println(nilai[2])

    val members: Array<String?> = arrayOfNulls(5)
    members[0]="Nugi"
    members[1]="Nugi"
    members[2]="Nugi"
    members[3]="Nugi"
    members[4]="Nugi"
    println(members[0])
}