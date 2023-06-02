class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String = "1234"
) : Funcionario (nome = nome, cpf = cpf, salario = salario, tipo = null) {


//    fun autentica(senha: String): Boolean {
//        return senha == this.senha
//    }
}