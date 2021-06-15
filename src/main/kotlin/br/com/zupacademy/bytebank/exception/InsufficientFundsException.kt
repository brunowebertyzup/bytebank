package br.com.zupacademy.bytebank.exception

class InsufficientFundsException(
    message: String = "The funds is insufficiente!"
) : Exception(message)
