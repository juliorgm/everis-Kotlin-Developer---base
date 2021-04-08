fun main(){
    val salarios = doubleArrayOf((0..8000).random().toDouble(),(0..8000).random().toDouble(),(0..8000).random().toDouble(),(0..8000).random().toDouble(),(0..8000).random().toDouble(),(0..8000).random().toDouble(),(0..8000).random().toDouble())

    for(salario in salarios){
        println(salario)
    }

    println("-------------------------------")
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média salário: ${salarios.average()}")

    val salariosFilter = salarios.filter { salario -> salario > 3000.0 }
    println("-------------------------------")
    salariosFilter.forEach{ println("R$ $it")}

    println("-----------COUNT----------------")
    println(salarios.count{it in 2000.0..6000.0})

    println("-----------FIND----------------")
    println(salarios.find{it in 2000.0..5000.0})

}