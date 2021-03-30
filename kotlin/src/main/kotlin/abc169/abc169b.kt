import java.math.BigDecimal

//

fun main() {
    abc169b()
}

fun abc169b() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toLong() }
    val lim = BigDecimal(1000000000000000000L)
    var base = BigDecimal(a[0])
    if (a.count { it == 0L } > 0) {
        println(0)
        return
    }
    for (i in 1 until n) {
        base = base.multiply(BigDecimal(a[i]))
        if (base > lim) {
            println(-1)
            return
        }
    }
    println(base.toLong())
}
