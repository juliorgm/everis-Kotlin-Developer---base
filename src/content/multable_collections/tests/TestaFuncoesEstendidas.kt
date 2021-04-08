package content.multable_collections

fun main(){
    val valores = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "1234".toBigDecimal(),
        "6412".toBigDecimal(),
        "7894".toBigDecimal(),
    )

    println("---------somatoria-----------")
    println(valores.somatoria())
    println("-----------média-------------")
    println(valores.media())
}