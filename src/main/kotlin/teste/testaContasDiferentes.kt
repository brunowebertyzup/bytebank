import modelo.ContaCorrente
import modelo.ContaPoupanca
import modelo.ContaSalario

fun testaContasDiferentes() {
    println("Bem vindo ao Bytebank")

    var contaCorrente = ContaCorrente(
        titular = "Bruno",
        numero = 1001
    )
    var contaPoupanca = ContaPoupanca(
        titular = "Maria",
        numero = 1002
    )

    val contaSalario = ContaSalario(
        titular = "Gui",
        numero = 1003
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)
    contaSalario.deposita(1000.0)

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)
    contaSalario.saca(100.0)

    println("Saldo conta corrente saque = ${contaCorrente.saldo}")
    println("Saldo conta poupança saque = ${contaPoupanca.saldo}")
    println("Saldo após saque salário: ${contaSalario.saldo}")

    contaCorrente.transfere(100.0, contaSalario)

    println("Saldo conta corrente transfência para poupança = ${contaCorrente.saldo}")
    println("Saldo conta salario receber transfência da corrente = ${contaSalario.saldo}")

    contaPoupanca.transfere(300.0, contaSalario)

    println("Saldo conta salario receber transfência da poupança = ${contaSalario.saldo}")
    println("Saldo conta poupança transfência para salario = ${contaPoupanca.saldo}")
}
