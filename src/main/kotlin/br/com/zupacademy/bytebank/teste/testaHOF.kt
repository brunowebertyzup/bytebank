package br.com.zupacademy.bytebank.teste

import br.com.zupacademy.bytebank.modelo.Autenticavel
import br.com.zupacademy.bytebank.modelo.SistemaInterno

fun testaHOF() {
    soma(2, 2, resultado = (::println))

    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }

    SistemaInterno().entra(autenticavel, 1234, autenticado = {
        println("Realizar pagamento")
    })
}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    println("antes da soma")
    resultado(a + b)
    println("depois da soma")

}