package br.com.zupacademy.bytebank.teste

import br.com.zupacademy.bytebank.modelo.Endereco

fun testaFuncoesEscopo() {
    //    val endereco = Endereco(logradouro = "rua vergueiro", numero = 3185)
//    val enderecoEmMaiusculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
//    println(enderecoEmMaiusculo)
    val endereco = Endereco()
//        .also { println("Criando endereço") }
        .apply {
            logradouro = "rua vergueiro"
            numero = 3185
        }
    with(endereco) {
        "$logradouro, $numero".toUpperCase()
    }.let(::println)

//    listOf(
//        Endereco(complemento = "casa"),
//        Endereco(),
//        Endereco(complemento = "apartamento")
//    ).filter (predicate = {endereco ->  endereco.complemento.isNotEmpty()})
//        .let (block = (::println) )
//
}