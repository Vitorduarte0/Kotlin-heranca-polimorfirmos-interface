class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    tipoFuncionario: TipoFuncionario = TipoFuncionario.GERENTE,
    val senha: String = "1234"
) : Funcionario(nome = nome, cpf = cpf, salario = salario, tipo = tipoFuncionario)