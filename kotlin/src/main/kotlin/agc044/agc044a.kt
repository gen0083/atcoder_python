import java.lang.Math.pow
import kotlin.math.abs
import kotlin.math.min

//

fun main() {
    agc044a()
}

fun agc044a() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val (n, a, b, c, d) = readLine()!!.split(" ").map { it.toLong() }
        val coins = howManyCoins(n, a, b, c, d)
        println(coins)
    }
}

private fun howManyCoins(n: Long, a: Long, b: Long, c: Long, d: Long): Long {
    val onlyD = n * d
    var onlyA = d
    var temp = n
    var count = 0
    while (temp > 1) {
        temp /= 2
        count++
    }
    var remain = abs(n - pow(2.0, count.toDouble())).toLong()
    onlyA += a * count + remain * d
    var limit = min(onlyD, onlyA)
    var onlyB = d
    temp = n
    count = 0
    while (temp > 1) {
        temp /= 3
        count++
    }
    remain = abs(n - pow(3.0, count.toDouble())).toLong()
    onlyB += b * count + remain * d
    limit = min(limit, onlyB)
    var onlyC = d
    temp = n
    count = 0
    while (temp > 1) {
        temp /= 5
        count++
    }
    remain = abs(n - pow(5.0, count.toDouble())).toLong()
    onlyC += c * count + remain * d
    limit = min(limit, onlyC)
    val pattern = mutableListOf<Coins>()
    //    makePattern(pattern, DivideCounter(n), a, b, c, d)
    //    pattern.add(DivideCounter(0L, countD = onlyD))
    pattern.add(Coins(n, limit, a, b, c, d))
    countUp(pattern, Coins(1L, d, a, b, c, d), n, limit)
    val minCount = pattern.minBy { it.coins }!!.coins
    return minCount
}

private fun countUp(pattern: MutableList<Coins>, cur: Coins, n: Long, limit: Long) {
    if (cur.current == n) {
        pattern.add(cur)
        return
    }
    var next = cur.current * 2
    if (next > n) {
        val patternD = cur.copy(n, coins = cur.coins + cur.d * abs(n - cur.current))
        if (patternD.coins < limit) countUp(pattern, patternD, n, limit)
    } else {
        val patternA = cur.copy(next, coins = cur.coins + cur.a)
        if (patternA.coins < limit) countUp(pattern, patternA, n, limit)
    }
    next = cur.current * 3
    if (next > n) {
        val patternD = cur.copy(n, coins = cur.coins + cur.d * abs(n - cur.current))
        if (patternD.coins < limit) countUp(pattern, patternD, n, limit)
    } else {
        val patternB = cur.copy(next, coins = cur.coins + cur.b)
        if (patternB.coins < limit) countUp(pattern, patternB, n, limit)
    }
    next = cur.current * 5
    if (next > n) {
        val patternD = cur.copy(n, coins = cur.coins + cur.d * abs(n - cur.current))
        if (patternD.coins < limit) countUp(pattern, patternD, n, limit)
    } else {
        val patternC = cur.copy(cur.current * 5, coins = cur.coins + cur.c)
        if (patternC.coins < limit) countUp(pattern, patternC, n, limit)
    }
}

private fun makePattern(pattern: MutableList<DivideCounter>, cur: DivideCounter, a: Long, b: Long,
    c: Long, d: Long) {
    if (cur.current <= 1L) {
        if (pattern.isEmpty()) {
            pattern.add(cur)
        } else {
            val p = pattern[0]
            if (p.countCoins(a, b, c, d) > cur.countCoins(a, b, c, d)) {
                pattern.remove(p)
                pattern.add(cur)
            }
        }
        return
    }
    val ar = cur.current % 2
    val patternA = cur.copy(countD = cur.countD + ar)
    patternA.apply {
        current = cur.current / 2
        countA++
    }
    val br = cur.current % 3
    val patternB = cur.copy(countD = cur.countD + br)
    patternB.apply {
        current = cur.current / 3
        countB++
    }
    val cr = cur.current % 5
    val patternC = cur.copy(countD = +cr)
    patternC.apply {
        current = cur.current / 5
        countC++
    }
    makePattern(pattern, patternA, a, b, c, d)
    makePattern(pattern, patternB, a, b, c, d)
    makePattern(pattern, patternC, a, b, c, d)
}

private data class DivideCounter(
    var current: Long,
    var countA: Long = 0L,
    var countB: Long = 0L,
    var countC: Long = 0L,
    var countD: Long = 0L
) {
    
    fun countCoins(a: Long, b: Long, c: Long, d: Long): Long {
        return a * countA + b * countB + c * countC + d * countD
    }
}

private data class Coins(
    var current: Long,
    var coins: Long,
    val a: Long,
    val b: Long,
    val c: Long,
    val d: Long
)