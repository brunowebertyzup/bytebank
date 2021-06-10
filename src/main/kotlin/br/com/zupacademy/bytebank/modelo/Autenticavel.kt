package br.com.zupacademy.bytebank.modelo

interface Autenticavel {

    fun autentica(senha: Int): Boolean
}