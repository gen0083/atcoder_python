import java.util.*

// https://atcoder.jp/contests/aising2020/tasks/aising2020_e
// TODO: try to AC
// dよりできそうな気はする

fun main() {
    aising2020e()
}

fun aising2020e() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val n = readLine()!!.toInt()
        val queue = PriorityQueue<Order>(Comparator { o1, o2 -> o1.priority - o2.priority })
        var precious = 0L
        var current = 0
        
    }
}

private data class Order(val priority: Int, val fill: Long, val out: Long)