package one.digitalinnovation.digionebank

class Pessoa {
    var name: String = "Gabriel"
    var cpf: String = "133.155.233.12"
    private set

    constructor()

    fun pessoaInfo() = "$name e $cpf"

}

fun main() {
    val Gabriel = Pessoa()
    println(Gabriel.pessoaInfo())

}