import content.collections.tests.Funcionario

fun main(){
    val joao = Funcionario(nome="João",salario=1100.0, tipo = "clt")
    val maria = Funcionario(nome="Maria",salario=3100.0, tipo = "clt")
    val vitor = Funcionario(nome="Vitor",salario=1400.0, tipo = "PJ")

    val listOne = listOf(joao, vitor)
    val listTwo = listOf(maria)

    val result = listOne.union(listTwo)
    result.forEach{println(it)}

    println("---------------------------")
    val newResult = result.subtract(listTwo)
    newResult.forEach{println(it)}

    println("---------------------------")
    val intersectResult = result.intersect(listTwo)
    intersectResult.forEach{println(it)}
}

