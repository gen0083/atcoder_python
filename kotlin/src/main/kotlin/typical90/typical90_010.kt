fun main() {
    typical90_010()
}

fun typical90_010() {
    val n = readLine()!!.toInt()
    val sum = List(n + 2) { IntArray(2) { 0 } }
    for (i in 1..n) {
        val (c, p) = readLine()!!.split(" ").map { it.toInt() }
        sum[i][c - 1] = p
    }
    for (i in n - 1 downTo 1) {
        for (c in 0..1) {
            sum[i][c] += sum[i + 1][c]
        }
    }
    val q = readLine()!!.toInt()
    repeat(q) {
        val (l, r) = readLine()!!.split(" ").map { it.toInt() }
        val sum0 = sum[l][0] - sum[r + 1][0]
        val sum1 = sum[l][1] - sum[r + 1][1]
        println("$sum0 $sum1")
    }
}