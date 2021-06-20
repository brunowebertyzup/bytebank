package br.com.zupacademy.bytebank.teste


fun testaFuncaoAnonima() {
    val minhaFuncaoAnonima = fun(a: Int, b: Int): Int {
        return a + b
    }
    println(minhaFuncaoAnonima(2, 2))

    val calculadoraBonificacaoAnonima: (salario: Double) -> Double = fun(salario): Double {
        if (salario > 1000.0) {
            return salario + 50
        }
        return salario + 100.0
    }
    println(calculadoraBonificacaoAnonima(1000.0))
}

fun testaFuncaoLambda() {
    val minhaFuncaoLambda = { _: Int, b: Int ->
        6 + b
    }
    println(minhaFuncaoLambda(3, 2))
    val calculadoraBonificacao: (salario: Double) -> Double = lambda@{ salario ->
        if (salario > 1000.0) {
            return@lambda salario + 50
        }
        return@lambda salario + 100.0
    }

    println(calculadoraBonificacao(1001.0))
}

fun testaFuncaoTipoClasse() {
    val minhaFuncaoClasses = Soma()
    println(minhaFuncaoClasses(10, 10))
}

fun testaFuncaoTipoReferencia() {
    val minhaFuncao: (Int, Int) -> Int = ::soma
    println(minhaFuncao(5, 10))
}

fun soma(a: Int, b: Int): Int {
    return a + b
}

class Soma : (Int, Int) -> Int {
    override fun invoke(a: Int, b: Int): Int {
        return a + b
    }


}