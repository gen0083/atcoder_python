// https://atcoder.jp/contests/agc032/tasks/agc032_b

fun main() {
    agc032b()
}

fun agc032b() {
    val n = readLine()!!.toInt()
    val targetNum = if (n == 4) 5 else n * (n + 1) / 2 - n
    // 根拠はわからんが、n=4のときだけ4が作れる最大値の6が2では作れない→ここだけ特殊
    // それ以外はnで作れる最大値が共通の最大値と思われる
    val points = List(n) { mutableSetOf<Int>() }
    for (i in points.lastIndex downTo 0) {
        var t = points[i].sum()
        for (j in n downTo 1) {
            if (i + 1 == j) continue
            if (j in points[i]) continue
            if (t + j <= targetNum) {
                if (points[j - 1].sum() + j > targetNum) continue
                t += j
                points[i].add(j)
                points[j - 1].add(i + 1)
            }
        }
    }
    val ans = mutableListOf<String>()
    for ((i, v) in points.withIndex()) {
        val num = i + 1
        for (j in v) {
            if (j > num) {
                ans.add("$num $j")
            }
        }
    }
    println(ans.size)
    println(ans.joinToString("\n"))
}

private fun test(n: Int) {
    val allSum = n * (n + 1) / 2
    val pattern = MutableList<MutableSet<Int>>(n) { mutableSetOf<Int>() }
    for (i in 1..n) {
        generatePattern(n, 1, i, 0, pattern)
    }
    var set = pattern[0]
    val cannot = MutableList(n) { setOf<Int>() }
    for ((i, e) in pattern.withIndex()) {
        set = set.intersect(e).toMutableSet()
        cannot[i] = pattern.last().subtract(e)
    }
    println("max n = ${allSum - n}")
    println("全共通最大値 ${set.max()}")
    println("各iごとに作れない数")
    cannot.forEachIndexed { i, v ->
        println("${i + 1} = ${v.joinToString(" ")}")
    }
}

private fun generatePattern(i: Int, n: Int, skip: Int, current: Int,
    pattern: List<MutableSet<Int>>) {
    if (n > i) {
        pattern[skip - 1].add(current)
        return
    }
    generatePattern(i, n + 1, skip, current, pattern)
    if (n != skip) {
        generatePattern(i, n + 1, skip, current + n, pattern)
    }
}