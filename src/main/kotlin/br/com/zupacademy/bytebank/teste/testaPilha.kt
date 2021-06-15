package br.com.zupacademy.bytebank.teste

import br.com.zupacademy.bytebank.exception.InsufficientFundsException

fun funcao1() {
    println("Inicio funcao1")
    try {
        funcao2()
    } catch (e: InsufficientFundsException) {
        e.printStackTrace()
        println("InsufficientFundsException foi pegada")
    }
    println("Fim funcao1")
}

fun funcao2() {
    println("Inicio funcao2")
    for (i in 1..5) {
        println(i)
        throw InsufficientFundsException()
    }

    println("Fim funcao 2")
}