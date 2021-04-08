fun main(){
    val salarios = DoubleArray(4)

    salarios[0] = (1100..10000).random().toDouble()
    salarios[1] = (1100..10000).random().toDouble()
    salarios[2] = (1100..10000).random().toDouble()
    salarios[3] = (1100..10000).random().toDouble()

    salarios.forEach { println(it.toInt()) }

    salarios.forEachIndexed(){index, d -> println("$index - $d")}

    val salaryTwo = doubleArrayOf(123.0,1234.65,7412.0)
}