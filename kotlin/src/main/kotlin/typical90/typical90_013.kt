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
    val to = IntArray(n + 1) { 0 }
    val from = IntArray(n + 1) { 0 }
    val next = PriorityQueue<Road> { t1, t2 -> t1.cost - t2.cost }
    val visited = mutableSetOf<Int>()
    for (i in listOf(1, n)) {
        visited.add(i)
        for (r in roads[i]) {
            next.add(r)
        }
        while (visited.size < n) {
            val r = next.poll()
            if (r.to in visited) continue
            visited.add(r.to)
            if (i == 1) {
                to[r.to] = to[r.from] + r.cost
            } else {
                from[r.to] = from[r.from] + r.cost
            }
            for (r in roads[r.to]) next.add(r)
        }
        visited.clear()
    }
    repeat(n) {
        println(to[it + 1] + from[it + 1])
    }
}

private data class Road(val from: Int, val to: Int, val cost: Int)