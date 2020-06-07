//

fun main() {
    agc045a()
}

fun agc045a() {
    // こういうのはヒューリスティックな問題になるのかな？
    val t = readLine()!!.toInt()
    for (notUse in 0 until t) {
        val n = readLine()!!.toInt()
        val a = readLine()!!.split(" ").map { it.toLong() }
        val s = readLine()!!
        if (s.last() == '1') {
            // そも最終手番が1であるなら、0にはできない
            // Nのタイミングで0であるならxor操作をすれば0以外になる（Aiは1以上なので）
            // 0以外なら何もしなければよいので最終手番が0のときのみ検討すればよい
            println(1)
            continue
        }
        if (s.count { it == '1' } == 0) {
            // 人1の手番がないのであれば何もしないで0が達成できる
            println(0)
            continue
        }
        if (s.count { it == '0' } == 0) {
            // 人0の手番がないのであれば検討するまでもなく0以外になる
            println(1)
            continue
        }
        var i = n - 1
        var x = 0L
        // 以降は1の最後の手番からさかのぼって検討すればよいかと思われる
        // 人1は必ずどこかでxor操作を行わなければならない
        val vNumber = mutableSetOf<Long>()
        vNumber.add(0L)
        var pick = mutableListOf<Long>()
        while (i >= 0 && s[i] == '0') {
            pick.add(a[i])
            vNumber.add(a[i])
            i--
        }
        // 1が行動できる最後の手番
        val lastOne = i
        pick.reverse()
        makePattern(0, 0L, pick, vNumber)
        // これで0が0にできる数値の候補ができあがる
        // 1の目標はvNumber以外の数値を自分の最終手番で作れるかどうかを検討すること
        pick = mutableListOf()
        while (i >= 0 && s[i] == '1') {
            pick.add(a[i])
            i--
        }
        pick.reverse()
        val looseNumber = mutableSetOf<Long>()
        makePattern(0, 0L, pick, looseNumber)
        var impossible = false
        for (loose in looseNumber) {
            if (loose in vNumber) {
                continue
            } else {
                impossible = true
                break
            }
        }
        if (impossible) {
            // 人1は妨害が可能、ただし1の手番がくるまでに0がさらに妨害できるかも検討しないとならない
            println(1)
        } else {
            println(0)
            continue
        }
    }
}

private fun makePattern(i: Int, current: Long, numbers: List<Long>, vNumber: MutableSet<Long>) {
    if (i == numbers.size) {
        vNumber.add(current)
        return
    }
    val next = i + 1
    makePattern(next, current, numbers, vNumber)
    makePattern(next, current.xor(numbers[i]), numbers, vNumber)
}

private fun searchPossible(i: Int, current: Long, numbers: List<Long>, vNumber: MutableSet<Long>,
    looseNumber: MutableSet<Long>) {
    if (i == numbers.size) {
        if (current !in vNumber) {
            looseNumber.add(current)
        }
        return
    }
    val next = i + 1
    searchPossible(next, current, numbers, vNumber, looseNumber)
    searchPossible(next, current.xor(numbers[i]), numbers, vNumber, looseNumber)
}