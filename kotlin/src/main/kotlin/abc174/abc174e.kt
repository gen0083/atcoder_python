import java.lang.Long.max
import java.lang.Math.ceil

//

fun main() {
    abc174e()
}

fun abc174e() {
    val (n, k) = readLine()!!.split(" ").map { it.toLong() }
    val a = readLine()!!.split(" ").map { it.toLong() }
    if (k == 0L) {
        println(a.maxOrNull())
        return
    }
    var total = 0L
    var max = 0L
    for (l in a) {
        max = max(max, l)
        total += l
    }
    if (total <= k) {
        println(1)
        return
    }
    var left = 1L
    var right = max
    while (left + 1L < right) {
        val mid = (left + right) / 2
        var count = 0L
        for (l in a) {
            count += (ceil(l.toDouble() / mid) - 1).toInt().coerceAtLeast(0)
            if (count > k) break
        }
        if (count <= k) {
            right = mid
        } else {
            left = mid
        }
    }
    println(right)
}
