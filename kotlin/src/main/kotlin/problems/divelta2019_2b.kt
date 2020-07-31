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
    val sortX = plots.sortedBy { it.first }
    val costMap = mutableMapOf<Pair<Long, Long>, MutableList<Pair<Int, Int>>>()
    for (i in 0 until n) {
        val base = sortX[i]
        for (j in i + 1 until n) {
            val t = sortX[j]
            val p = t.first - base.first
            val q = t.second - base.second
            if (p to q in costMap) {
                costMap[p to q]!!.add(i to j)
            } else {
                costMap[p to q] = mutableListOf(i to j)
            }
        }
    }
    var cost = 0
    val visited = mutableSetOf<Int>()
    for (list in costMap.values) {
        val lines = mutableSetOf<Int>()
        for ((i, j) in list) {
            if (i in visited || j in visited) continue
            // 同じp,qでも異なる直線かもしれないのでその確認は必要
            if (i !in lines && j !in lines) {
                cost++
            }
            lines.add(i)
            lines.add(j)
        }
        visited.addAll(lines)
        if (visited.size == n) break
    }
    if (visited.size < n) {
        // 最後に1つだけ余ったりする、もしくは基点がすでに他のもので使われてしまっている場合の対策場
        // あぶれたのが複数ある場合、その2点を直線で繋げばコスト1で2点回収できる
        cost += (n - visited.size) / 2 + 1
    }
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