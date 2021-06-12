//

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
    for (i in 2 until n) {
        total[i][0] = (total[i - 1][0] + a[i]) % base
        total[i][0] = (total[i][0] + (total[i - 1][1] + a[i] % base)) % base
        total[i][1] = (total[i - 1][0] - a[i]) % base
    }
    println((total[n - 1][0] + total[n - 1][1]) % base)
}
