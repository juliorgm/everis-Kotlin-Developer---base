package content.collections.tests

fun main(){
    val joao = Funcionario(nome="João",salario=1100.0, tipo = "clt")
    val maria = Funcionario(nome="Maria",salario=3100.0, tipo = "clt")
    val vitor = Funcionario(nome="Vitor",salario=1400.0, tipo = "PJ")

    val funcionarios = listOf(joao,maria,vitor)
    funcionarios.forEach { println(it) }
    println("-------------------------")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("-------------------------")
    funcionarios
        .groupBy { it.tipo }
        .forEach { println(it) }
    

}

data class Funcionario(
    val nome:String,
    val salario:Double,
    val tipo:String
){
    override fun toString(): String ="""
        $nome - $salario - $tipo
    """.trimIndent()
}