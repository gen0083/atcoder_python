import java.math.BigDecimal
import java.math.RoundingMode

//

fun main() {
    abc180d()
}

fun abc180d() {
    val (x, y, a, b) = readLine()!!.split(" ").map { BigDecimal(it) }
    var count = 0L
    var p = x
    while (p * a < p + b) {
        if (p * a >= y) break
        count++
        p *= a
    }
    val remain = (y - p - BigDecimal.ONE).divide(b, RoundingMode.FLOOR)
    if (remain > BigDecimal.ZERO) count += remain.longValueExact()
    println(count)
}