import java.lang.Integer.min
import java.util.*

//

fun main() {
    arc105b()
}

fun arc105b() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }.toSet()
    val queue = PriorityQueue<Int> { o1, o2 -> o2 - o1 }
    queue.addAll(a)
    var m = a.min()!!
    var x = queue.poll()
    while (x != m) {
        val t = x - m
        m = min(m, t)
        if (t !in a) {
            queue.add(t)
        }
        x = queue.poll()
    }
    println(m)
}