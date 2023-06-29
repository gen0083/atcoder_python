import java.util.*

fun main() {
    typical90_013()
}

fun typical90_013() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val roads = List(n + 1) { mutableListOf<Road>() }
    repeat(m) {
        val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }
        roads[a].add(Road(a, b, c))
        roads[b].add(Road(b, a, c))
    }
    val to = IntArray(n + 1) { Int.MAX_VALUE }
    val from = IntArray(n + 1) { Int.MAX_VALUE }
    to[1] = 0
    from[n] = 0
    val next = PriorityQueue<Pair<Int, Int>> { t1, t2 -> t2.second - t1.second }
    var temp: IntArray
    for (i in listOf(1, n)) {
        next.add(0 to i)
        temp = if (i == 1) to else from
        while (next.isNotEmpty()) {
            val (f, t) = next.poll()
            for (r in roads[t]) {
                if (temp[r.to] > temp[r.from] + r.cost) {
                    temp[r.to] = temp[r.from] + r.cost
                    next.add(t to r.to)
                }
            }
        }
    }
    repeat(n) {
        println(to[it + 1] + from[it + 1])
    }
}

private data class Road(val from: Int, val to: Int, val cost: Int)