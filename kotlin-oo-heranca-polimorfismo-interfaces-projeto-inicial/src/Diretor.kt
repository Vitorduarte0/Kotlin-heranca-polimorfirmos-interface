class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    tipoFuncionario: TipoFuncionario = TipoFuncionario.DIRETOR,
    val senha: String = "1234"
) : Funcionario(nome = nome, cpf = cpf, salario = salario, tipo = tipoFuncionario)