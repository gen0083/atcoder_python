import java.util.*
import kotlin.math.ceil

// https://atcoder.jp/contests/diverta2019-2/tasks/diverta2019_2_b

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
    val picked = mutableSetOf<Int>()
    val sortedCosts = costMap.values.filter { it.size > 1 }.sortedByDescending { it.size }
    for (s in sortedCosts) {
        var maxCount = 0
        var maxLines = mutableSetOf<Int>()
        for ((i, j) in s) {
            if (i in picked || j in picked) continue
            val lines = mutableSetOf<Int>(i, j)
            var left = i
            var right = j
            var count = 0
            val queue = ArrayDeque<Pair<Int, Int>>()
            queue.addAll(s)
            var found = true
            while (queue.isNotEmpty() && found) {
                val times = queue.size
                var repeatTimes = 0
                found = false
                while (repeatTimes < times) {
                    val t = queue.poll()
                    repeatTimes++
                    when {
                        t.first == right -> {
                            found = true
                            right = t.second
                            count++
                            lines.add(t.second)
                        }
                        
                        t.second == left -> {
                            found = true
                            left = t.first
                            count++
                            lines.add(t.first)
                        }
                        
                        else             -> {
                            queue.add(t)
                        }
                    }
                }
                if (maxCount < count) {
                    maxCount = count
                    maxLines = lines
                }
            }
        }
        if (maxLines.isNotEmpty()) {
            picked.addAll(maxLines)
            cost++
        }
        if (picked.size == n) break
    }
    if (picked.size < n) {
        cost += ceil((n - picked.size) / 2.0).toInt()
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