enum class TipoFuncionario(val tipo: Int) {
    FUNCIONARIO(1),
    GERENTE(2),
    DIRETOR(3),
    MESTRE_OBRA(4),
    ANALISTA(5)
}

open class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
    val tipo: TipoFuncionario
) {
    fun bonificacao(): Double {
        when (tipo) {
            TipoFuncionario.FUNCIONARIO -> return salario * 0.1
            TipoFuncionario.GERENTE -> return salario * 0.2
            TipoFuncionario.DIRETOR -> return salario * 0.3
            TipoFuncionario.MESTRE_OBRA -> return salario * 0.5
            TipoFuncionario.ANALISTA -> return salario * 0.6
        }
        return 0.0
    }

}