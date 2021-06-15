import br.com.zupacademy.bytebank.modelo.*

fun testaContasDiferentes() {
    println("Bem vindo ao Bytebank")

    val jesus = Cliente(
        nome = "Jesus",
        cpf = "902.123.218-31",
        senha = 1010,
        endereco = Endereco(
            logradouro = "Rua das Pedras",
            numero = 213,
            bairro = "Acassias",
            cidade = "Japalão",
            estado = "Bahia",
            cep = "28392-001",
            complemento = "Portão grande"
        )
    )
    val maria = Cliente(
        nome = "Maria",
        cpf = "902.123.218-31",
        senha = 1010
    )
    val jose = Cliente(
        nome = "Jose",
        cpf = "902.123.218-31",
        senha = 1010
    )

    var contaCorrente = ContaCorrente(
        titular = jesus,
        numero = 1001
    )

    println("titular")
    println("nome do titular ${contaCorrente.titular.nome}")
    println("cpf do titular ${contaCorrente.titular.cpf}")
    println("endereço do titular ${contaCorrente.titular.endereco.logradouro} ${contaCorrente.titular.endereco.numero}")

    var contaPoupanca = ContaPoupanca(
        titular = maria,
        numero = 1002
    )

    val contaSalario = ContaSalario(
        titular = jose,
        numero = 1003
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)
    contaSalario.deposita(1000.0)

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)
    contaSalario.saca(100.0)

    println("Saldo conta corrente saque = ${contaCorrente.saldo}")
    println("Saldo conta poupança saque = ${contaPoupanca.saldo}")
    println("Saldo após saque salário: ${contaSalario.saldo}")

    contaCorrente.transfere(100.0, contaSalario, 1010)

    println("Saldo conta corrente transfência para poupança = ${contaCorrente.saldo}")
    println("Saldo conta salario receber transfência da corrente = ${contaSalario.saldo}")

    contaPoupanca.transfere(300.0, contaSalario, 1010)

    println("Saldo conta salario receber transfência da poupança = ${contaSalario.saldo}")
    println("Saldo conta poupança transfência para salario = ${contaPoupanca.saldo}")
}
