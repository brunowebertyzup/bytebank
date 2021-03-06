package br.com.zupacademy.bytebank.teste

import br.com.zupacademy.bytebank.modelo.Endereco

fun testaAny() {
    val endereco = Endereco(
        logradouro = "Rua Caetano",
        complemento = "Apartamento",
        cep = "00000-000"
    )
    val enderecoNovo = Endereco(
        logradouro = "Rua Caetano",
        complemento = "Apartamento",
        cep = "00000-000"
    )
    println(endereco.equals(enderecoNovo))

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    println(endereco)
    println(enderecoNovo)

    println("${endereco.javaClass}@${Integer.toHexString(endereco.hashCode())}")
}

fun imprime(valor: Any): Any {
    println(valor)
    return valor
}