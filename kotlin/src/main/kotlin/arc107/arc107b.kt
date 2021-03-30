//

fun main() {
    arc107b()
}

fun arc107b() {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    var count = 0L
    val m = n + 1
    for (i in 2..2 * n) {
        val j = i - k
        if (j !in 2..2 * n) continue
        val o = pattern(i, m)
        val p = pattern(j, m)
        // Intでo*pを計算するとオーバーフローが起こる
        count += (o * p)
    }
    println(count)
}

private fun pattern(i: Int, m: Int): Long {
    return (if (i > m) {
        2 * m - i - 1
    } else {
        i - 1
    }).toLong()
}