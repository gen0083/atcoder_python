import java.util.*

fun main(args: Array<String>) {
    paizaa055()
}

fun paizaa055() {
    val (h, w) = readLine()!!.split(" ").map { it.toInt() }
    val maze = mutableListOf<String>()
    maze.add("G".repeat(w + 2))
    var c = 0
    var r = 0
    repeat(h) { i ->
        val s = buildString {
            append("G")
            append(readLine()!!)
            append("G")
        }
        if (s.contains("S")) {
            c = i + 1
            r = s.indexOf('S')
        }
        maze.add(s)
    }
    maze.add("G".repeat(w + 2))
    val visited = mutableSetOf<Pair<Int, Int>>()
    visited.add(c to r)
    val queue = ArrayDeque<Pair<Int, Int>>()
    queue.add(c to r)
    while (queue.isNotEmpty()) {
        val (i, j) = queue.pop()
        val left = i - 1 to j
        val right = i + 1 to j
        val top = i to j - 1
        val bottom = i to j + 1
        for (next in listOf(left, right, top, bottom)) {
            if (next in visited) continue
            visited.add(next)
            when (maze[next.first][next.second]) {
                'G' -> {
                    println("YES")
                    return
                }
                '.' -> {
                    queue.add(next)
                }
                else -> Unit
            }
        }
    }
    println("NO")
}