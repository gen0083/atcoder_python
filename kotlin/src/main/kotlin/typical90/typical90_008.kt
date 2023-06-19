fun main() {
    typical90_008()
}

fun typical90_008() {
    val n = readLine()!!.toInt()
    val s = readLine()!!
    val dp = List(n + 1) { LongArray(7) { 0L } }
    val target = arrayOf('a', 't', 'c', 'o', 'd', 'e', 'r')
    val base = 1_000_000_000L + 7L
    for ((i, c) in s.withIndex()) {
        for (j in 0..6) {
            dp[i + 1][j] = dp[i][j]
            if (c == target[j]) {
                if (j == 0) {
                    dp[i + 1][j] = (dp[i][j] + 1L) % base
                } else {
                    dp[i + 1][j] = (dp[i + 1][j - 1] + dp[i][j]) % base
                }
            }
        }

    }
    println(dp[n][6])
}