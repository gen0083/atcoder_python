// https://atcoder.jp/contests/abc129/tasks/abc129_c

fun main() {
    abc129c()
}

fun abc129c() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val step = LongArray(n + 1) { 0L }
    repeat(m) {
        val i = readLine()!!.toInt()
        step[i] = -1L
    }
    step[0] = 1
    for (i in 1..n) {
        if (step[i] == -1L) continue
        val one = step[i - 1]
        val two = if (i > 1) step[i - 2] else 0L
        var s = 0L
        if (one != -1L) s += one
        if (two != -1L) s += two
        // 毎回modとらないとオーバーフローしてWAになる
        step[i] = s % 1_000_000_007L
    }
    println(step[n].coerceAtLeast(0L))
}
