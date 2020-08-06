import java.util.*

// https://atcoder.jp/contests/abc170/tasks/abc170_d

fun main() {
    abc170d()
}

fun abc170d() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    val sorted = a.sorted()
    val primes = mutableSetOf<Int>()
    val sameNum = mutableSetOf<Int>()
    val queue = ArrayDeque<Int>(sorted)
    while (queue.isNotEmpty()) {
        val t = queue.poll()
        if (t in primes) {
            sameNum.add(t)
        } else {
            // prime check
            primes.add(t)
            val len = queue.size
            repeat(len) {
                val e = queue.poll()
                if (t == e) {
                    sameNum.add(e)
                } else if (e % t != 0) {
                    queue.add(e)
                }
            }
        }
    }
    println(primes.count() - sameNum.count())
}
