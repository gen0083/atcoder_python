import java.util.*
import kotlin.math.min

//

fun main() {
    heroes4c()
}

fun heroes4c() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val (n, k, x, y) = readLine()!!.split(" ").map { it.toInt() }
        val shelves = readLine()!!.split(" ").map { it.toInt() }
        var total = shelves.sum()
        val target = k * n
        var overKCount = shelves.count { it > k }
        if (overKCount == 0) {
            println(0)
        } else {
            if (total <= target) {
                val op1 = overKCount * x
                println(min(op1, y))
            } else {
                // そもそも冊数がオーバーしてるので絶対にop1が必要
                val heap = PriorityQueue<Int>() { o1, o2 -> o2 - o1 }
                heap.addAll(shelves)
                var time = 0
                while (overKCount > 0 && total > target) {
                    total -= heap.poll()
                    overKCount--
                    time += x
                    if (total <= target) break
                }
                val op1 = overKCount * x
                println(min(time + y, time + op1))
            }
        }
    }
}
