import java.util.*

//

fun main() {
    msolutions2020c()
}

fun msolutions2020c() {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toLong() }
    val queue = ArrayDeque<Long>()
    queue.addAll(a.subList(0, k))
    for (i in k until n) {
        val out = queue.poll()
        val next = a[i]
        if (next.toDouble() / out > 1.0) {
            println("Yes")
        } else {
            println("No")
        }
        queue.add(next)
    }
}
