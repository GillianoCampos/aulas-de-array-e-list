package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 1000.0, "clt")
    val pedro = Funcionario("Pedro", 5000.0, "pj")
    val maria = Funcionario("Maria", 3000.0, "clt")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(maria.nome, maria)
    repositorio.create(pedro.nome, pedro)

    println(repositorio.findById(maria.nome))

    println("----------imprimir relatório do findAll-----------")
    repositorio.findAll().forEach{println(it)}

    println("---------Removendo Maria e imprime todos atualizados-----------")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach{println(it)}

}