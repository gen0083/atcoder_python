// https://atcoder.jp/contests/arc116/submissions/21567453
// TODO: try to AC

fun main(args: Array<String>) {
    arc116b()
}

fun arc116b() {
    val base = 998244353L
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toLong() }.sortedDescending()
    val b = a.toTypedArray()
    var c = 2
    for (i in 1 until n) {
        b[i] = b[i] * c
        c *= 2
    }
    var s = b.sum()
    var total = 0L
    for (i in 0 until n) {
        s -= a[i]
        s /= 2
        s += a[i]
        total = (((s * a[i]) % base) + total) % base
        s -= a[i]
    }
    println(total)
}