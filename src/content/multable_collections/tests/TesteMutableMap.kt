package content.multable_collections

import content.collections.tests.Funcionario


fun main(){
    val joao = Funcionario(nome="João",salario=1100.0, tipo = "clt")
    val maria = Funcionario(nome="Maria",salario=3100.0, tipo = "clt")
    val vitor = Funcionario(nome="Vitor",salario=1400.0, tipo = "PJ")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(maria.nome, maria)
    repositorio.create(vitor.nome, vitor)

    repositorio.getAll().forEach { println(it) }
}