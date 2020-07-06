import java.util.*
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

fun main() {
    abc133d()
}

fun abc133d() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toLong() }.toTypedArray()
    val rain = LongArray(n) { 0L }
    val priorityQueue = PriorityQueue<Pair<Long, Int>>(
        kotlin.Comparator { o1, o2 -> (o2.first - o1.first).toInt() })
    for ((i, v) in a.withIndex()) {
        if (v == 0L) continue
        priorityQueue.add(v to i)
    }
    while (priorityQueue.isNotEmpty()) {
        val current = priorityQueue.poll()
        val currentIndex = current.second
        val currentValue = current.first
        if (a[currentIndex] != currentValue) {
            // 隣接する山からの降水を考慮して値が変わっているので更新する
            if (a[currentIndex] != 0L) priorityQueue.add(a[currentIndex] to currentIndex)
            continue
        }
        // 隣接するダムのうち貯水量が大きい方を選ぶ
        val nextIndex = nextMountain(currentIndex, n)
        val prevIndex = prevMountain(currentIndex, n)
        val targetIndex = if (a[nextIndex] > a[prevIndex]) {
            nextIndex
        } else {
            prevIndex
        }
        val rainFall = 1L
        val mountain =
            if (abs(currentIndex - targetIndex) == 1) max(currentIndex, targetIndex) else min(
                currentIndex, targetIndex)
        rain[mountain] += rainFall * 2
        a[currentIndex] -= rainFall
        a[targetIndex] -= rainFall
        if (a[currentIndex] != 0L) {
            priorityQueue.add(a[currentIndex] to currentIndex)
        }
    }
    println(rain.joinToString(" "))
}

private fun prevMountain(i: Int, n: Int): Int {
    return if (i == 0) n - 1 else i - 1
}

private fun nextMountain(i: Int, n: Int): Int {
    return (i + 1) % n
}