package one.digitalinnovation.collections

fun main() {

    println("------Não conseguimos adicionar, deletar nessas lista apicollection no proximo capitulo colecção mutaveis conseguimos--------")
    val joao = Funcionario("João", 1000.0, "clt")
    val pedro = Funcionario("Pedro",5000.0, "pj")
    val maria = Funcionario("Maria", 3000.0, "clt")

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach{println(it)}

    println("------Utilizando filtro com find--------")
    println(funcionarios.find{it.nome == "Maria"})

    println("------Utilizando Sorted com Lista ordenando pelo salario--------")
    funcionarios.sortedBy { it.salario }.forEach{println(it)}

    println("------Utilizando o groupby pelo tipo--------")
    funcionarios.groupBy { it.tipo}.forEach{println(it)}
}
    data class Funcionario(
        val nome : String,
        val salario: Double,
        val tipo : String
    )
    {
        override fun toString(): String =
        """
         Nome : $nome
         Salário: $salario 
         """.trimIndent()
    }

