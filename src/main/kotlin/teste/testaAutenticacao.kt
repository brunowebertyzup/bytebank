import modelo.Cliente
import modelo.Diretor
import modelo.Gerente
import modelo.SistemaInterno

fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Bruno",
        cpf = "921.218.100-10",
        salario = 6000.0,
        senha = 1000
    )

    val diretora = Diretor(
        nome = "Maria",
        cpf = "223.333.222-49",
        salario = 10000.0,
        senha = 2000,
        plr = 300.0
    )

    val cliente = Cliente(
        nome = "João",
        cpf = "902.123.218-31",
        senha = 1010
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 1000)
    sistema.entra(diretora, 2000)
    sistema.entra(cliente, 1010)


}
