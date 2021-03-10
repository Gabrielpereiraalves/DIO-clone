package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val Gabriel = Pessoa(nome = "Gabriel Pereira", cpf = "13523342112")
    println(Gabriel.nome)
    println(Gabriel.cpf)

    val joao = Funcionario("Gabriel Pereira","13523342112", BigDecimal.valueOf(1800.0))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}