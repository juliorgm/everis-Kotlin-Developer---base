fun main(){
    val pair: Pair<String, Double> = Pair("João",1000.0)
    val pair2: Pair<String, Double> = Pair("Vitória",2000.0)
    val map1 = mapOf(pair, pair2)


    map1.forEach { k, v -> println("nome $k - salário $v")  }

    val map2 = mapOf(
        "Marcos" to 2500.0,
        "Fernanda" to 2200.0,
        "Aderbal" to 2900.0,
        "Verônica" to 3050.0,
    )
    println("----------------------------------")
    map2.forEach{nome,salario -> println("Nome: $nome, Salário $salario")}
}