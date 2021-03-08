package one.digitalinnovation.digionebank

class Pessoa {
    var name: String = "Gabriel"
    var cpf: String = "133.155.233.12"
    private set
}

fun main() {
    val Gabriel = Pessoa()

    println(Gabriel)
    println(Gabriel.name)
    println(Gabriel.cpf)
}