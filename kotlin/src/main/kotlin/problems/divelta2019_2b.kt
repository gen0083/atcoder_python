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
    val sortY = plots.sortedBy { it.second }
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