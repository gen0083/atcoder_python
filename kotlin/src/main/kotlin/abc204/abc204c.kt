import java.util.*

//

fun main() {
    abc204c()
}

fun abc204c() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val reach = List(n + 1) { i -> mutableSetOf(i) }
    repeat(m) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        reach[a].add(b)
    }
    var count = 0
    for (start in 1..n) {
        val possible = mutableSetOf<Int>()
        val stack = ArrayDeque<Int>()
        stack.addAll(reach[start])
        while (stack.isNotEmpty()) {
            val i = stack.pop()
            if (i in possible) continue
            possible.add(i)
            stack.addAll(reach[i])
        }
        count += possible.size
    }
    println(count)
}
