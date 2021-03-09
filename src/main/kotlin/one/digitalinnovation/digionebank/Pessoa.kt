package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Gabriel"
    var cpf: String = "133.155.233.12"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"

}

fun main() {
    val Gabriel = Pessoa()
    println(Gabriel.pessoaInfo())

}