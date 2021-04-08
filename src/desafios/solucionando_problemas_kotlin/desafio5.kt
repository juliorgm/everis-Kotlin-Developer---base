fun main(args: Array<String>) {
    for (i in 1..readLine()!!.toInt()) {
        val input = readLine()!!.split(" ").map { it.toInt() } as MutableList
        input.sort()
        val mdc = mdc(input[0],input[1])

        println(mdc)
    }
    println(       ("\n"))
}

// máximo divisor comum (chamada recursiva)
fun mdc(n1: Int, n2: Int): Int {
    val lista:MutableList<Int> = mutableListOf<Int>()
    for (i in 1..n2){
        if ((n1%i == 0) && (n2%i == 0)) lista.add(i)
    }
    val mdc = lista.maxOrNull()
    return mdc!!.toInt()
}