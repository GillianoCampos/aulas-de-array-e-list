package one.digitalinnovation.collections

fun main() {
    println("------Não conseguimos adicionar, deletar nessas lista apicollection no proximo capitulo colecção mutaveis conseguimos--------")
    val joao = Funcionarionovo("João", 1000.0, "clt")
    val pedro = Funcionarionovo("Pedro", 5000.0, "pj")
    val maria = Funcionarionovo("Maria", 3000.0, "clt")

    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }

    println("---------Subtract----------")
    val funcionarios3 = setOf(joao, pedro, maria)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }

    println("---------Intersect----------")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }
}