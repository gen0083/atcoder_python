import java.util.*

// https://atcoder.jp/contests/abc168/tasks/abc168_d

fun main() {
    abc168d()
}

fun abc168d() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val toSign = IntArray(n + 1) { 0 }
    toSign[0] = -1
    toSign[1] = -1
    val loads = Array<MutableSet<Int>>(n + 1) { mutableSetOf() }
    repeat(m) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        loads[a].add(b)
        loads[b].add(a)
    }
    val queue = ArrayDeque<Int>()
    val reached = mutableSetOf<Int>(1)
    queue.add(1)
    while (queue.isNotEmpty() && reached.size < n) {
        val size = queue.size
        for (i in 0 until size) {
            val base = queue.pollFirst()
            for (l in loads[base]) {
                if (l !in reached) {
                    reached.add(l)
                    queue.add(l)
                    toSign[l] = base
                }
            }
        }
    }
    if (toSign.contains(0)) {
        println("No")
    } else {
        println("Yes")
        for (i in 2..n) {
            println(toSign[i])
        }
    }
}
