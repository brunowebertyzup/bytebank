import modelo.ContaCorrente
import modelo.ContaPoupanca

fun testaComportamentosConta() {
    val contaBruno = ContaCorrente(titular = "Bruno", numero = 1000)
    contaBruno.deposita(5000.0)

    val contaMaria = ContaPoupanca("Maria", 1001)
    contaMaria.deposita(3000.0)

    println(contaBruno.titular)
    println(contaBruno.numero)
    println(contaBruno.saldo)
    println()

    println(contaMaria.titular)
    println(contaMaria.numero)
    println(contaMaria.saldo)

    println("Depositando na conta do Bruno")
    contaBruno.deposita(50.0)
    println(contaBruno.saldo)

    println("Sacando conta do Bruno")
    contaBruno.saca(5050.0)
    println("Saldo Bruno pos saque: ${contaBruno.saldo}")
    println()
    println("Depositando na conta da Maria")
    contaMaria.deposita(230.0)
    println(contaMaria.saldo)
    println()
    println("Sacando conta da Maria")
    contaMaria.saca(3030.0)
    println("Saldo Maria pos saque: ${contaMaria.saldo}")

    println("Transferência da conta da Maria para o Bruno")
    if (contaMaria.transfere(valor = 210.0, destino = contaBruno)) {
        println("Transferência realizada com sucesso!")
    } else {
        println("Não há saldo para realizar essa operação!")
    }

    println("Saldo Bruno pos transferência: ${contaBruno.saldo}")
    println("Saldo Maria pos transferência: ${contaMaria.saldo}")
}