fun main() {
    val contaCorrente = ContaCorrente("Vitinho", 123)
    val contaPoupanca = ContaPoupaca("Ellinha", 321)

    println("Depositando nas contas do vitor e da ellen")
    println("depositando...")

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("Pronto, operação realizada com sucesso!")

    contaCorrente.saca(100.0)
    println("Saque de 100 reais foi realizado com sucesso na conta corrente")
    println("Seu novo saldo agora é de: ${contaCorrente.saldo}")
    contaPoupanca.saca(100.0)
    println("Saque de 100 reais foi realizado com sucesso na conta poupança")
    println("Seu novo saldo agora é de: ${contaPoupanca.saldo}")
    contaPoupanca.transfere(100.0, contaCorrente)
    println("Transferindo 100 reais da conta poupança para a conta corrente")
    println("Saldo da conta corrente é de: ${contaCorrente.saldo}")
    println("Saldo da conta poupança é de: ${contaPoupanca.saldo}")

    println("------------------------------------")

    contaCorrente.transfere(99999.0, contaPoupanca)
    println("Transferido 800 reais da conta corrente para a conta poupança")
    println("Saldo da conta corrente agora é de: ${contaCorrente.saldo}")
    println("Saldo da conta poupança agora é de: ${contaPoupanca.saldo}")
}


