import java.util.*

// https://atcoder.jp/contests/abc075/tasks/abc075_c

fun main() {
    abc075c()
}

fun abc075c() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val edges = mutableListOf<Pair<Int, Int>>()
    val nodes = List(n + 1) { mutableSetOf<Int>() }
    repeat(m) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        edges.add(a to b)
        nodes[a].add(b)
        nodes[b].add(a)
    }
    var count = 0
    for (e in edges) {
        val start = e.first
        val goal = e.second
        val visited = mutableSetOf<Int>()
        val queue = ArrayDeque<Int>()
        var isAvailable = false
        visited.add(start)
        for (node in nodes[start]) {
            if (node == goal) continue
            queue.add(node)
        }
        while (queue.isNotEmpty()) {
            val node = queue.poll()
            if (node == goal) {
                isAvailable = true
                break
            }
            if (node in visited) continue
            visited.add(node)
            for (elm in nodes[node]) {
                if (elm !in visited) queue.add(elm)
            }
        }
        if (!isAvailable) count++
    }
    println(count)
}