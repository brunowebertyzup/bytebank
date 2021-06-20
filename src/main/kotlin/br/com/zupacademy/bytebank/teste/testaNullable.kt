package br.com.zupacademy.bytebank.teste

import br.com.zupacademy.bytebank.modelo.Endereco

fun testaNullable() {
    var enderecoNulo: Endereco? = Endereco(logradouro = "Rua da Mentira, 235")
    var logradouroNovo: String? = enderecoNulo?.logradouro
    enderecoNulo?.let {
        println(it.logradouro.length)
        val tamanhoComplemento: Int = it.complemento?.length
        println(tamanhoComplemento)
    }
    teste("b")
}

fun teste(valor: Any) {
    val numero: Int? = valor as? Int
    println(numero)
}