fun main(){
    val names = Array(5){""}

    names[0] = "Maria"
    names[1] = "José"
    names[2] = "João"
    names[3] = "Adriana"
    names[4] = "Rebeca"

    names.sort()
    names.forEach { println(it) }

    val lastNames = arrayOf("Dutra","Silva","Santos","Verne","Catra")
    println("\n=========================")
    for(index in lastNames.indices){
        println("${names[index]} ${lastNames[index]}")
    }

}