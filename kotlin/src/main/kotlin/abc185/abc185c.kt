import java.math.BigDecimal

//

fun main() {
    abc185c()
}

fun abc185c() {
    val l = readLine()!!.toLong()
    var base = BigDecimal.ONE
    val items = mutableSetOf(2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L)
    for (i in (l - 11L) until l) {
        var t = i
        var k = 0L
        for (j in items) {
            if (t % j == 0L) {
                k = j
            }
        }
        if (k != 0L) {
            t /= k
            items.remove(k)
        }
        base = base * BigDecimal(t)
    }
    for (i in items) {
        base /= BigDecimal(i)
    }
    println(base.toLong())
}
