package one.digitalinnovation.collections

fun main() {
    val salarios = DoubleArray(3)

    salarios[0]=1000.0
    salarios[1]=3000.0
    salarios[2]=500.0

    salarios.forEach { println(it) }

    println("------Salario com aumento em 10%------")
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }

    println("------utilizando arrayof com double------")
    val salarios2 = doubleArrayOf(1500.0, 3250.0, 4000.0)
    salarios2.sort()
    salarios2.forEach { println(it) }

    println("------utilizando Min------")
    println("Menor Salário:  ${salarios2.min()}")
    println("Maior Salário:  ${salarios2.max()}")
    println("Média de Salário:  ${salarios2.average()}")

    println("------Filtrando todos sálarios maio que 2500.0------")
    val salariomaiorque2500 = salarios2.filter { it > 2500.0 }
    salariomaiorque2500.forEach{println(it)}

    println("------utilizando count , find e any------")
    println(salarios2.count{it in 2000.0..5000.0})
    println(salarios2.find{it == 3250.0})

    println("------quando resultado do find não encontra é null------")
    println(salarios2.find{it == 800.0})

    println("------any retorna true ou false------")
    println(salarios2.any{it == 800.0})
    println("------any retorna true ou false e find retorna o conteúdo------")

    println("------a funcçao max e min lá em cima esta depreciado portanto utilizar maxornull e minornull recomendado------")
    println("Menor Salário:  ${salarios2.minOrNull()}")
    println("Maior Salário:  ${salarios2.maxOrNull()}")

}

