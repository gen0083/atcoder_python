import kotlin.math.max

//

fun main() {
    abc172c()
}

fun abc172c() {
    val (n, m, k) = readLine()!!.split(" ").map { it.toLong() }
    val a = readLine()!!.split(" ").map { it.toLong() }
    val b = readLine()!!.split(" ").map { it.toLong() }
    var max_count = 0
    // REの理由はメモリの限界を超えてるから
    val times = LongArray((m + 1).toInt()) { 0L }
    val ni = n.toInt()
    val mi = m.toInt()
    var max_j = 0
    for (j in 0 until mi) {
        times[j + 1] = times[j] + b[j]
        if (times[j + 1] <= k) {
            max_count = max(max_count, j + 1)
            max_j = j + 1
        } else {
            break
        }
    }
    var ai = 0L
    for (i in 1..ni) {
        ai += a[i - 1]
        for (j in max_j downTo 0) {
            if (times[j] + ai <= k) {
                max_count = max(max_count, i + j)
                break
            } else {
                max_j = j
            }
        }
    }
    println(max_count)
}
