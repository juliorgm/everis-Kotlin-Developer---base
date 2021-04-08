fun main(){
    val n = readLine()!!.toInt()

    for (numbers in 1..n){
        val x = readLine()!!.toDouble()

        if (isPrime(x)) println("Prime")
        else println("Not Prime")
    }
}

fun isPrime(num:Double):Boolean{
    val aux = Math.sqrt(num.toDouble() + 1).toInt()
    for (i in 2..aux){
        if (num % i == 0.0) return false
    }
    return true
}
//fun getListPrime():MutableList<Int>{
//    val listPrimes = mutableListOf<Int>()
//    for(index in 2..230){
//        var count = 0
//        for (j in 2..index) {
//            if (index % j == 0) count++
//            if (count <= 1) listPrimes.add(index)
//        }
//    }
//    return listPrimes
//}