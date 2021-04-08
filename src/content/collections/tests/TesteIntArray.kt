fun main(){
    val values = IntArray(size=5)
    values[0] = (0..9).random()
    values[1] = (0..9).random()
    values[2] = (0..9).random()
    values[3] = (0..9).random()
    values[4] = (0..9).random()

    for( valor in values){
        println(valor)
    }

    values.forEach { x -> println("valor $x") }

    values.sort()
    for (index in values.indices){
        println("Index $index - ${values[index]}")
    }
}