package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3) { "" }
    nomes[0] = "Maria"
    nomes[1] = "José"
    nomes[2] = "Joao"

    for (nome in nomes) {
        println(nome)
    }

    println("------Array ordenado------")
    nomes.sort()
    nomes.forEach {
        println(it)
    }

    println("------ArrayOf ordenado ------")
    val nomes2 = arrayOf ("Maria", "Zaza", "Pedro")
    nomes2.sort()
    nomes2.forEach { println(it) }
}