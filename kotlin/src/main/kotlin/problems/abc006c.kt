//

fun main() {
    abc006c()
}

fun abc006c() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val minValue = n * 2
    val maxValue = n * 4
    if (m < minValue || m > maxValue) {
        println("-1 -1 -1")
        return
    }
    if (m - minValue > maxValue - m) {
        // 全員大人の場合から考えたほうが早い
        // 大人の数を減らして足の本数を増やす＝赤ちゃんに割り当てたら2本増えて、老人に割り当てたら1本増える
        // とりあえず足らない本数をすべて赤ちゃんで補ってみて、端数は老人に割り当てる
        val remain = m - minValue
        var children = remain / 2
        var adult = n - children
        var old = 0
        if (children * 4 + adult * 2 > m) {
            children--
            old++
        } else if (children * 4 + adult * 2 < m) {
            old++
            adult--
        }
        println("$adult $old $children")
    } else {
        // 全員赤ちゃんから考えて、赤ちゃんを大人に割り振ることで足を2本減らす
        val remain = maxValue - m
        var adult = remain / 2
        var children = n - adult
        var old = 0
        if (adult * 2 + children * 4 > m) {
            old++
            children--
        } else if (adult * 2 + children * 4 < m) {
            old++
            adult--
        }
        println("$adult $old $children")
    }
}