import java.math.BigDecimal

//

fun main() {
    abc169c()
}

fun abc169c() {
    val (a, b) = readLine()!!.split(" ")
    val A = BigDecimal(a)
    val B = BigDecimal(b)
    val m = A.multiply(B)
    val text = m.toPlainString()
    println(text.substring(0, text.lastIndex - 2))
}
