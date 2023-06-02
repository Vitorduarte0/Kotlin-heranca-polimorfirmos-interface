class Gerente(
    val nome: String,
    val cpf: String,
    val salario: Double,
    val senha: String = "1234"
) {
    fun bonificacao(): Double {
        return this.salario * 0.3
    }

    fun autentica(senha: String): Boolean {
        return senha == this.senha
    }
}