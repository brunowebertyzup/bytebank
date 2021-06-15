import br.com.zupacademy.bytebank.exception.AuthenticationFailure
import br.com.zupacademy.bytebank.exception.InsufficientFundsException
import br.com.zupacademy.bytebank.modelo.Cliente
import br.com.zupacademy.bytebank.modelo.ContaCorrente
import br.com.zupacademy.bytebank.modelo.ContaPoupanca
import java.lang.Exception

fun testaComportamentosConta() {
    var bruno = Cliente(nome = "Bruno", cpf = "", senha = 1)
    val contaBruno = ContaCorrente(titular = bruno, numero = 1000)
    contaBruno.deposita(5000.0)

    var maria = Cliente(nome = "Maria", cpf = "", senha = 2)

    val contaMaria = ContaPoupanca(maria, 1000)
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
    try {
        contaMaria.transfere(valor = 200.0, destino = contaBruno, senha = 2)
        println("Transferência realizada com sucesso!")
    } catch (e: InsufficientFundsException) {
        println("Falha na transferência!")
        println("Não há saldo para realizar essa operação!")
        e.printStackTrace()
    } catch (e: AuthenticationFailure) {
        println("Falha na transferência!")
        println("Falha na autênticação!")
        e.printStackTrace()
    } catch (e: Exception) {
        println("Erro desconhecido")
        e.printStackTrace()
    }

    println("Saldo Bruno pos transferência: ${contaBruno.saldo}")
    println("Saldo Maria pos transferência: ${contaMaria.saldo}")
}