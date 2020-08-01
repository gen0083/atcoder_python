// https://atcoder.jp/contests/diverta2019-2/tasks/diverta2019_2_b
// TODO: try to AC
// N=50なんで全組み合わせで探索とかでいけそうな気もするが、N!だと収まらない

fun main() {
    divelta2019_2b()
}

fun divelta2019_2b() {
    val n = readLine()!!.toInt()
    val plots = mutableListOf<Pair<Long, Long>>()
    repeat(n) {
        val (x, y) = readLine()!!.split(" ").map { it.toLong() }
        plots.add(x to y)
    }
    val costMap = mutableMapOf<Pair<Long, Long>, MutableList<Pair<Int, Int>>>()
    for (i in 0 until n) {
        val base = plots[i]
        for (j in 0 until n) {
            val t = plots[j]
            val p = base.first - t.first
            val q = base.second - t.second
            if (p == 0L && q == 0L) continue
            if (p to q in costMap) {
                costMap[p to q]!!.add(i to j)
            } else {
                costMap[p to q] = mutableListOf(i to j)
            }
        }
    }
    var cost = 0
    val visited = mutableSetOf<Int>()
    val sortedCosts = costMap.values.sortedByDescending { it.size }
    for (s in sortedCosts) {
        var maxCount = 0
        var maxLines = mutableSetOf<Int>()
        for ((i, j) in s) {
            if (i in visited || j in visited) continue
            val lines = mutableSetOf<Int>(i, j)
            var left = i
            var right = j
            var count = 2
            for ((i, j) in s) {
                if (i in visited || j in visited) continue
                if (i == right) {
                    right = j
                    lines.add(j)
                    count++
                } else if (j == left) {
                    left = i
                    count++
                    lines.add(i)
                }
            }
            if (maxCount < count) {
                maxCount = count
                maxLines = lines
            }
        }
        if (maxLines.isNotEmpty()) {
            visited.addAll(maxLines)
            cost++
        }
        if (visited.size == n) break
    }
    if (visited.size < n) cost++
    println(cost)
}

private fun testOrder() {
    var i = 50
    var count = 1L
    while (i > 1) {
        count *= i
        i--
    }
    println("50! = $count")
}