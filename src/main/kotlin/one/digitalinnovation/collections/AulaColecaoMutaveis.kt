package one.digitalinnovation.collections

fun main() {
    val joao = Funcionarionovo("João", 1000.0, "clt")
    val pedro = Funcionarionovo("Pedro", 5000.0, "pj")
    val maria = Funcionarionovo("Maria", 3000.0, "clt")

    println("----------Lista mutável conseguimos alterar---------")
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println("----------Adicionando---------")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("---------Removendo---------")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("----------set---------")
    val funcionariosSet = mutableSetOf(joao)
    funcionariosSet.forEach { println(it) }

    println("----------AdicionandoSet---------")
    funcionariosSet.add(pedro)
    funcionariosSet.add(maria)
    funcionariosSet.forEach { println(it) }

    println("----------RemovendoSet---------")
    funcionariosSet.remove(pedro)
    funcionariosSet.forEach { println(it) }
}
