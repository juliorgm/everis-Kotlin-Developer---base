package content.multable_collections

import content.collections.Funcionario

fun main(){
    val joao = Funcionario(nome="João",salario=1100.0, tipo = "clt")
    val maria = Funcionario(nome="Maria",salario=3100.0, tipo = "clt")
    val vitor = Funcionario(nome="Vitor",salario=1400.0, tipo = "PJ")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.add(vitor)
    funcionarios.forEach{ println(it)}
}