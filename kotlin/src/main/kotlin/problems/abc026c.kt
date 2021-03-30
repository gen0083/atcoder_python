// https://atcoder.jp/contests/abc026/tasks/abc026_c

import kotlin.math.max
import kotlin.math.min

fun main() {
    abc026c()
}

fun abc026c() {
    val n = readLine()!!.toInt()
    val buka = List(n + 1) { mutableSetOf<Int>() }
    for (i in 2..n) {
        val joushi = readLine()!!.toInt()
        buka[joushi].add(i)
    }
    // これをループで処理しようと思うとややこしいけれどnは20以下なので再帰処理で十分
    val salary = calculateSalary(1, buka)
    println(salary)
}

private fun calculateSalary(id: Int, buka: List<MutableSet<Int>>): Int {
    var maxSalary = 0
    var minSalary = Int.MAX_VALUE
    if (buka[id].isEmpty()) {
        return 1
    }
    for (b in buka[id]) {
        val salary = calculateSalary(b, buka)
        maxSalary = max(maxSalary, salary)
        minSalary = min(minSalary, salary)
    }
    return maxSalary + minSalary + 1
}