import modelo.Analista
import modelo.CalculadoraBonificacao
import modelo.Diretor
import modelo.Gerente

fun testaFuncionarios() {
    var bruno = Analista (
        nome = "Bruno",
        cpf = "112.222.111-30",
        salario = 1500.0
    )

    println("nome ${bruno.nome}")
    println("cpf ${bruno.cpf}")
    println("salario ${bruno.salario}")
    println("bonificação ${bruno.bonificacao}")

    val maria = Gerente(
        nome = "Maria",
        cpf = "123.123.123-30",
        salario = 3000.0,
        senha = 1234
    )
    println()
    println("nome ${maria.nome}")
    println("cpf ${maria.cpf}")
    println("salario ${maria.salario}")
    println("bonificação ${maria.bonificacao}")
    if (maria.autentica(1234)) {
        println("Senha autenticada com sucesso")
    } else {
        println("Falha ao autenticar")
    }

    val gui = Diretor(
        nome = "Gui",
        cpf = "123.134.123-19",
        salario = 2000.0,
        senha = 1253,
        plr = 200.0
    )

    println()
    println("nome ${gui.nome}")
    println("cpf ${gui.cpf}")
    println("salario ${gui.salario}")
    println("bonificação ${gui.bonificacao}")
    println("plr ${gui.plr}")
    if (gui.autentica(1245)) {
        println("Senha autenticada com sucesso")
    } else {
        println("Falha ao autenticar")
    }

    var julia = Analista(nome = "Julia", cpf = "282.281.927-01", salario = 4000.0)

    var calculadora = CalculadoraBonificacao()
    calculadora.registra(bruno)
    calculadora.registra(maria)
    calculadora.registra(gui)
    calculadora.registra(julia)

    println("Total de bonificação: ${calculadora.total}")
}