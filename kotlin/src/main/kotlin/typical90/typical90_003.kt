import java.util.*

fun main() {
    typical90_003()
}

fun typical90_003() {
    val n = readLine()!!.toInt()
    val edge = List(n + 1) { mutableSetOf<Int>() }
    repeat(n - 1) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        edge[a].add(b)
        edge[b].add(a)
    }
    val visited = mutableSetOf<Int>()
    val stack = ArrayDeque<Int>()
    var last = 1
    var depth = 0
    stack.push(1)
    repeat(2) {
        depth = 0
        while (stack.isNotEmpty()) {
            var i = stack.size
            while (i > 0) {
                val node = stack.pop()
                i--
                if (node in visited) continue
                visited.add(node)
                for (j in edge[node]) {
                    if (j in visited) continue
                    stack.add(j)
                }
                last = node
            }
            depth++
        }
        visited.clear()
        stack.clear()
        stack.push(last)
    }
    println(depth)
}