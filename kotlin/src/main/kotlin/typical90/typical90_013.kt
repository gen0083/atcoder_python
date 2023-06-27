import java.lang.Integer.min

fun main() {
    typical90_013()
}

fun typical90_013() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val roads = mutableListOf<Road>()
    repeat(m) {
        val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }
        roads.add(Road(a, b, c))
    }
    val to = IntArray(n + 1) { Int.MAX_VALUE }
    val from = IntArray(n + 1) { Int.MAX_VALUE }
    to[1] = 0
    from[n] = 0
    for (r in roads) {
        to[r.to] = min(to[r.to], to[r.from] + r.cost)
    }
    for (i in m - 1 downTo 0) {
        val r = roads[i]
        from[r.from] = min(from[r.from], from[r.to] + r.cost)
    }
    repeat(n) {
        println(to[it + 1] + from[it + 1])
    }
}

private data class Road(val from: Int, val to: Int, val cost: Int)