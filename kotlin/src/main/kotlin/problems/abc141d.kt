import java.util.*

fun main(args: Array<String>) {
    abc141d()
}

fun abc141d() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toLong() }
    val queue = PriorityQueue<Long>()
    var total = 0L
    for (l in a) {
        total += l
        queue.add(-l)
    }
    repeat(m) {
        val expensive = -queue.poll()
        val discount = Math.floor(expensive / 2.0).toLong()
        total += discount - expensive
        queue.add(-discount)
    }
    println(total)
}
