import kotlin.math.max

//

fun main() {
    abc306d()
}

fun abc306d() {
    val n = readLine()!!.toInt()
    val dp = List(n + 1) { LongArray(2) { 0L } }
    repeat(n) { i ->
        val (x, y) = readLine()!!.split(" ").map { it.toInt() }
        if (x == 0) {
            if (y > 0) {
                dp[i + 1][0] = max(dp[i][0], dp[i][1]) + y.toLong()
            } else {
                dp[i + 1][0] = max(dp[i][0], dp[i][1] + y.toLong())
                dp[i + 1][1] = dp[i][1]
            }
        } else {
            dp[i + 1][0] = dp[i][0]
            dp[i + 1][1] = max(dp[i][1], dp[i][0] + y.toLong())
        }
    }
    println(max(dp[n][0], dp[n][1]))
}
