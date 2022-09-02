import kotlin.math.max

//

fun main() {
    abc266d()
}

fun abc266d() {
    val n = readLine()!!.toInt()
    val s = Array(100001) { Array(7) { -1L } }
    var last = 0
    repeat(n) {
        val (t, x, a) = readLine()!!.split(" ").map { it.toInt() }
        s[t][x + 1] = a.toLong()
        last = t
    }
    s[0][1] = 0
    for (i in 1..last) {
        for (j in 1..5) {
            val m = max(s[i - 1][j - 1], max(s[i - 1][j], s[i - 1][j + 1]))
            if (m == -1L) {
                s[i][j] = -1
            } else {
                if (s[i][j] == -1L) {
                    s[i][j] = m
                } else {
                    s[i][j] += m
                }
            }
        }
    }
    println(s[last].max())
}
