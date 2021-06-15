package br.com.zupacademy.bytebank.exception

class AuthenticationFailure(
    message: String = "Authentication Failure"
) : Exception(message)