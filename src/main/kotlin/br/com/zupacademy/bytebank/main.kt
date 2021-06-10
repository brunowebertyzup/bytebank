import br.com.zupacademy.bytebank.modelo.Endereco

fun main() {

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

    //Testes do comportamento de Any
//    var objeto: Any = Any()
//    imprime(objeto)
//    imprime(1)
//    imprime(1.0)
//    val teste: Any = imprime(endereco)
//    println(teste)
//
//    testaFuncionarios()
}

fun imprime(valor: Any): Any {
    println(valor)
    return valor
}


