package one.digitalinnovation.digionebank

class Pessoa {
    var name: String = "Gabriel"
    var cpf: String = "133.155.233.12"
}

fun main() {
    val Gabriel = Pessoa()

    println(Gabriel.name)
    println(Gabriel.cpf)
}