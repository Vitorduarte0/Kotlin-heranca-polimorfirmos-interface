class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String = "1234"
) : Funcionario(nome = nome, cpf = cpf, salario = salario) {
    override fun bonificacao(): Double {
        return salario * 0.3
    }
}