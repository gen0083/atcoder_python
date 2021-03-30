//

fun main() {
    abc177c()
}

fun abc177c() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toLong() }
    var ans = 0L
    val base = 1_000_000_007L
    var p = a[0] % base
    for (i in 1 until n) {
        val t = (p * a[i]) % base
        ans = (ans + t) % base
        p = (p + a[i]) % base
    }
    println(ans)
}
