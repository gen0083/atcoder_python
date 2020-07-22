// https://atcoder.jp/contests/abc080/tasks/abc080_c
// TODO: refactoring to use bit operation

fun main() {
    abc080c()
}

fun abc080c() {
    val n = readLine()!!.toInt()
    val schedule = List(n) { mutableSetOf<Int>() }
    val profit = mutableListOf<LongArray>()
    for (i in 0 until n) {
        for ((index, isOpen) in readLine()!!.split(" ").map { it == "1" }.withIndex()) {
            // 月曜午前＝0 .. 金曜午後＝9
            if (isOpen) schedule[i].add(index)
        }
    }
    for (i in 0 until n) {
        val p = readLine()!!.split(" ").map { it.toLong() }.toLongArray()
        profit.add(p)
    }
    val pattern = mutableListOf<Set<Int>>()
    generatePattern(0, mutableSetOf<Int>(), pattern)
    var maxValue = Long.MIN_VALUE
    for (p in pattern) {
        var value = 0L
        for (i in 0 until n) {
            val count = schedule[i].intersect(p).count()
            value += profit[i][count]
        }
        if (value > maxValue) maxValue = value
    }
    println(maxValue)
}

private fun generatePattern(index: Int, current: MutableSet<Int>, pattern: MutableList<Set<Int>>) {
    if (index == 10) {
        if (current.isNotEmpty()) pattern.add(current)
        return
    }
    generatePattern(index + 1, current, pattern)
    // このやり方だとMutableSetのインスタンスがおなじになって全部同じ結果になってしまう
    // deep copyして別インスタンスに分岐してやらないと結果がおかしくなる
    val c = mutableSetOf<Int>()
    c.addAll(current)
    c.add(index)
    generatePattern(index + 1, c, pattern)
}