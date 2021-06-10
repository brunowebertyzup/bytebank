import br.com.zupacademy.bytebank.modelo.Cliente
import br.com.zupacademy.bytebank.modelo.ContaCorrente
import br.com.zupacademy.bytebank.modelo.ContaPoupanca

fun testaCopiasEReferencias(){
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println(numeroX)
    println(numeroY)

    val joao = Cliente(
        nome = "João",
        cpf = "902.123.218-31",
        senha = 1010
    )

    val maria = Cliente(
        nome = "maria",
        cpf = "902.123.218-31",
        senha = 1010
    )

    val contaJoao = ContaCorrente(joao, 1002)
    var contaMaria = ContaPoupanca(maria, 1003)
    println("Titular conta joao:${contaJoao.titular}")
    println("Titular conta maria:${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}