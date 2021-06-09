import modelo.ContaCorrente
import modelo.ContaPoupanca

fun testaCopiasEReferencias(){
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println(numeroX)
    println(numeroY)

    val contaJoao = ContaCorrente("João", 1002)
    var contaMaria = ContaPoupanca("Maria", 1003)
    contaMaria.titular = "Maria"
    contaJoao.titular = "João"
    println("Titular conta joao:${contaJoao.titular}")
    println("Titular conta maria:${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}