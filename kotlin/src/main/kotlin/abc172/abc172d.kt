import kotlin.math.sqrt

//

fun main() {
    abc172d()
}

fun abc172d() {
    val n = readLine()!!.toLong()
    var count = 0L
    for (i in 0L..n) {
        count += i * bun(i)
    }
    println(count)
}

private fun bun(n: Long): Long {
    val end = sqrt(n.toDouble()).toLong()
    var r = n
    var count = 1L
    for (i in 2..end) {
        var c = 1
        while (r % i == 0L) {
            r /= i
            c++
        }
        count *= c
    }
    return count
}