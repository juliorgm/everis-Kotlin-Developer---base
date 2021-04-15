package desafios.praticando_programacaok_otlin



fun main() {
    val N = readLine()!!.toInt()
    val capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVXZYWÇ"

    for (i in 1..N) {
        try {
            val text = readLine().toString()

            if (text.length != 3) throw Exception("Texto Inválido")

            val number1 = text[0].toString().toInt()
            val number2 = text[2].toString().toInt()
            val letter = text[1].toString()


            if(number1.equals(number2))
                println(number1 * number2)
            else if (capitalLetters.contains(letter))
                println(number2 - number1)
            else
                println(number1 + number2)


        }catch (e: Exception){
            println(e.message)
        }
    }
}

