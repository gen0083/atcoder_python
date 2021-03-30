import java.util.*

//

fun main() {
    abc173d()
}

fun abc173d() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toLong() }
    val sorted = a.sortedDescending()
    var total = 0L
    val queue = ArrayDeque<Long>()
    queue.add(sorted[0])
    for (i in 1 until n) {
        val good = if (i % 2 == 1) {
            queue.poll()
        } else {
            queue.peek()
        }
        queue.add(sorted[i])
        total += good
    }
    println(total)
}
