//

fun main() {
    abc295d()
}

fun abc295d() {
    val s = readLine()!!.map { it.toString().toInt() }
    val n = s.size
    val map = MutableList(n) { MutableList<Map<Int, Int>>(n) { mapOf() } }
    var length = 1
    var ans = 0
    while (length <= n) {
        for (l in 0 until n - length) {
            val r = l + length
            val m = s.subList(l, r + 1).groupingBy { it }.eachCount()
            if (m.filter { it.value % 2 == 1 }.none()) {
                ans += 1
            }
        }
        length += 2
    }
    println(ans)
}
