//

fun main() {
    abc280b()
}

fun abc280b() {
    val n = readLine()!!.toInt()
    val s = readLine()!!.split(" ").map { it.toLong() }
    val ans = LongArray(n)
    var prev = 0L
    for (i in 0 until n) {
        ans[i] = prev + s[i]
        prev = -s[i]
    }
    println(ans.joinToString(" "))
}
