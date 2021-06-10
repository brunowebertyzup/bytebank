package br.com.zupacademy.bytebank.teste

import br.com.zupacademy.bytebank.modelo.*

fun testaObjects() {
    val maria = object : Autenticavel {
        val nome: String = "Maria"
        val cpf: String = "111.222.666-19"
        val senha: Int = 1000

        override fun autentica(senha: Int) = this.senha == senha
    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(maria, 1000)
    println("Nome do cliente: ${maria.nome}")

    var bruno = Cliente(nome = "Bruno", cpf = "", senha = 1)
    val contaPoupanca = ContaPoupanca(titular = bruno, numero = 1000)
    val contaCorrente = ContaCorrente(titular = bruno, numero = 1001)


    println("Total de contas: ${Conta.total}")
}