fun main() {
    abc165c()
}

fun abc165c() {
    val (n, m, q) = readLine()!!.split(" ").map { it.toInt() }
    val pattern = mutableListOf<IntArray>()
    for (i in 1..m) {
        makePattern(n, m, i, pattern, mutableListOf<Int>(i))
    }
    val query = mutableListOf<Query>()
    repeat(q) {
        val (a, b, c, d) = readLine()!!.split(" ").map { it.toInt() }
        // aとbはインデックスなので-1している
        val q = Query(a - 1, b - 1, c, d)
        query.add(q)
    }
    val poiints = pattern.map { calculatePoint(it, query) }
    println(poiints.maxOrNull())
}

private fun makePattern(n: Int, m: Int, c: Int, pattern: MutableList<IntArray>,
    current: MutableList<Int>) {
    if (current.size == n) {
        pattern.add(current.toIntArray())
        return
    }
    for (i in c..m) {
        val next = mutableListOf<Int>()
        next.addAll(current)
        next.add(i)
        makePattern(n, m, i, pattern, next)
    }
}

private fun calculatePoint(list: IntArray, query: MutableList<Query>): Int {
    var total = 0
    for (q in query) {
        if (list[q.b] - list[q.a] == q.c) total += q.d
    }
    return total
}

data class Query(val a: Int, val b: Int, val c: Int, val d: Int)