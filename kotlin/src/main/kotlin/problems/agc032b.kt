// https://atcoder.jp/contests/agc032/tasks/agc032_b

fun main() {
    agc032b()
}

fun agc032b() {
    val n = readLine()!!.toInt()
    val ans = mutableListOf<String>()
    val isEven = n % 2 == 0
    for (i in 1 until n) {
        for (j in i + 1..n) {
            val isLink = if (isEven) {
                linkInEven(i, j, n)
            } else {
                linkInOdd(i, j, n)
            }
            if (isLink) ans.add("$i $j")
        }
    }
    println(ans.size)
    println(ans.joinToString("\n"))
}

private fun linkInOdd(i: Int, t: Int, n: Int): Boolean {
    if (i == t) return false
    if (t == n - i) return false
    return true
}

private fun linkInEven(i: Int, t: Int, n: Int): Boolean {
    if (i == t) return false
    if (t == n - i + 1) return false
    return true
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