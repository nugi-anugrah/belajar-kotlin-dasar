fun main() {
    var firstName: String ="Nugi"
    var lastName:  String ="Anugrah"
    var fullName:  String ="$firstName $lastName"
    var desc:      String = "$fullName length = ${fullName.length}"

    var address: String ="""
        >Jalan belum jadi, RT 01 RW 01
        >Kel. Rejosari
        >Kec. Tenayan Raya
        >Kota Pekanbaru
        """.trimMargin(">")

    println(firstName)
    println(lastName)
    println(address)
    println(fullName)
    println(desc)


}