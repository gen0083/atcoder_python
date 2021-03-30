// https://atcoder.jp/contests/abc114/tasks/abc114_c
// TODO: refactoring

fun main() {
    abc114c()
}

fun abc114c() {
    val n = readLine()!!
    if (n.toLong() < 357L) {
        // 3,5,7がすくなくとも1つずつ必要なので、最低値は357
        println(0)
        return
    }
    // 3,5,7の組み合わせだが、それぞれ1個以上ないといけないのが地味にきく
    // たとえば337とかは5がないのでダメ
    // N=1000の場合は6になる（357,375,537,573,735,753の6つ）
    // N=4000だと3桁は上記パターンのみ、4桁の数字だと4桁目に3が使えるようになるので、
    // 任意の1桁に3,5,7が自由に使えるようになる。これがややこしい
    // 最大でも10桁、かつ各桁3個の数字しかないので、全組み合わせでやればいいんじゃないだろうか
    // 解けたけど、こんなくそややこしいロジックより良い方法あるんちゃうの？
    // ただ解説を見た限り、考え方としてはこのやり方は悪くないらしい
    // 実装はよくなさそう
    val v = NanaGoSan(n)
    var count = 0
    while (v.increment()) {
        if (v.isSatisfy()) count++
    }
    println(count)
}

private class NanaGoSan(val origin: String) {
    val digits: Int
    val maxValue: IntArray
    val originValue: IntArray
    val currentValue: IntArray
    
    init {
        digits = origin.length
        maxValue = IntArray(digits)
        originValue = IntArray(digits)
        currentValue = IntArray(digits) { 0 }
        var n = origin.toLong()
        for (i in 0 until digits) {
            val t = n % 10
            originValue[i] = t.toInt()
            val v = when (t) {
                in 3..4 -> 1
                in 5..6 -> 2
                in 7..9 -> 3
                else    -> 0
            }
            n /= 10
            maxValue[i] = v
        }
        var i = digits - 1
        var update = false
        while (i >= 0) {
            if (update) {
                maxValue[i] = 3
            } else {
                if (originValue[i] !in setOf(3, 5, 7)) update = true
            }
            i--
        }
    }
    
    fun increment(i: Int = 0): Boolean {
        if (!lessThanLimit()) return false
        if (i >= digits) return false
        if (currentValue[i] == 3) {
            currentValue[i] = 1
            return increment(i + 1)
        }
        currentValue[i]++
        return true
    }
    
    fun isSatisfy(): Boolean {
        if (!lessThanLimit()) return false
        var one = 0
        var two = 0
        var three = 0
        for (i in digits - 1 downTo 0) {
            when (currentValue[i]) {
                1    -> one++
                2    -> two++
                3    -> three++
                else -> Unit
            }
            if (one > 0 && two > 0 && three > 0) return true
        }
        return false
    }
    
    private fun lessThanLimit(): Boolean {
        for (i in digits - 1 downTo 0) {
            if (currentValue[i] < maxValue[i]) return true
            if (currentValue[i] > maxValue[i]) return false
        }
        return true
    }
}