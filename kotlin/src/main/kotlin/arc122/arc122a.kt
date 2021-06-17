// https://atcoder.jp/contests/arc122/tasks/arc122_a

fun main() {
    arc122a()
}

fun arc122a() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toLong() }
    val base = 1_000_000_007L
    var total = List(n) { longArrayOf(0L, 0L) }
    if (n == 1) {
        println(a[0])
        return
    }
    total[1][0] = (a[0] + a[1]) % base
    total[1][1] = (a[0] - a[1]) % base
    if (total[1][1] < 0) total[1][1] += base
    var p = 2
    var m = 1
    for (i in 2 until n) {
        val plus = ((a[i].toBigInteger() * p.toBigInteger()) % base.toBigInteger()).toLong()
        total[i][0] = (total[i - 1][0] + plus) % base
        total[i][0] = (total[i][0] + total[i - 1][1]) % base
        val minus = (a[i].toBigInteger() * m.toBigInteger() % base.toBigInteger()).toLong()
        total[i][1] = (total[i - 1][0] - minus) % base
        if (total[i][0] < 0) total[i][0] += base
        if (total[i][1] < 0) total[i][1] += base
        val t = p
        p += m
        m = t
    }
    println((total[n - 1][0] + total[n - 1][1]) % base)
}
