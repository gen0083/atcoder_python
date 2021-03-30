fun main() {
    abc183c()
}

fun abc183c() {
    val (n, k) = readLine()!!.split(" ").map { it.toLong() }
    val time = mutableListOf<List<Long>>()
    repeat(n.toInt()) {
        val t = readLine()!!.split(" ").map { it.toLong() }
        time.add(t)
    }
    val pattern = mutableListOf<List<Int>>()
    val current = mutableListOf<Int>(0)
    makePattern(current, n.toInt(), pattern)
    var count = 0
    for (p in pattern) {
        var total = 0L
        for (s in 0 until n.toInt()) {
            val from = p[s]
            val to = p[s + 1]
            total += time[from][to]
        }
        if (total == k) count++
    }
    println(count)
}

private fun makePattern(current: MutableList<Int>, limit: Int, pattern: MutableList<List<Int>>) {
    if (current.size == limit) {
        current.add(0)
        pattern.add(current)
        return
    }
    for (i in 1 until limit) {
        if (i !in current) {
            val next = mutableListOf<Int>()
            next.addAll(current)
            next.add(i)
            makePattern(next, limit, pattern)
        }
    }
}