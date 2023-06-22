import kotlin.math.max

fun main() {
    typical90_011()
}

fun typical90_011() {
    val n = readLine()!!.toInt()
    val jobs = mutableListOf<Job>()
    var lastDead = 0
    repeat(n) {
        val (d, c, s) = readLine()!!.split(" ").map { it.toInt() }
        jobs.add(Job(c, d, s.toLong()))
        lastDead = max(lastDead, d)
    }
    jobs.sortBy { it.dead }
    val dp = List(n + 1) { LongArray(lastDead + 1) { 0L } }
    for (i in 1..n) {
        val job = jobs[i - 1]
        for (j in 1..lastDead) {
            if (j in job.needs..job.dead) {
                dp[i][j] = max(dp[i - 1][j - job.needs] + job.prise, dp[i - 1][j])
            } else {
                dp[i][j] = max(dp[i - 1][j], dp[i][j - 1])
            }
        }
    }
    println(dp[n][lastDead])
}

private data class Job(val needs: Int, val dead: Int, val prise: Long)