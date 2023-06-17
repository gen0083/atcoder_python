import java.math.BigDecimal

//

fun main() {
    abc306b()
}

fun abc306b() {
    val a = readLine()!!.split(" ").map { it.toInt() }
    var b = BigDecimal(1L)
    var ans = BigDecimal(0L)
    for (i in a) {
        if (i == 1) ans = ans.plus(b)
        b = b.multiply(BigDecimal(2L))
    }
    println(ans)
}
