fun main() {
    val vitor = Funcionario(
        nome = "Vitor",
        cpf = "096.381.125-81",
        salario = 3000.0,
        tipo = TipoFuncionario.DIRETOR
    )

    println("Seja bem vindo, ${vitor.nome} já temos seu dados, como cpf, ${vitor.cpf} e o salario ${vitor.salario}")
    println("Parabéns ${vitor.nome} você recebeu uma bonificação. sua bonificação foi de: ${vitor.bonificacao()}")

    val vinicius = Gerente(
        nome = "Vinicius",
        cpf = "118.488.239-83",
        salario = 3000.0,
        senha = "1234"
    )

    println("Seja bem vindo, ${vinicius.nome} já temos seu dados, como cpf, ${vinicius.cpf} e o salario ${vinicius.salario}")
    println("Parabéns ${vinicius.nome} você recebeu uma bonificação. sua bonificação foi de: ${vinicius.bonificacao()}")

    val ellen = Diretor(
        nome = "Ellen",
        cpf = "blabla",
        salario = 5000.0,
        senha = "1234"
    )

    println("Seja bem vindo, ${ellen.nome} já temos seu dados, como cpf, ${ellen.cpf} e o salario ${ellen.salario}")
}


