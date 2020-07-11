import java.util.*

// https://atcoder.jp/contests/agc032/tasks/agc032_a
// TODO: try to AC
// 雰囲気はわかる、B(i)の値とi番目の関係から、実現が不可能とか、何番目〜何番目の間に挿入が必要とかはわかる
// ただ、その結果プログラムとしてどう組み上げるのかがわからん
// というかこれはあれかな、全組み合わせを試すのが手っ取り早いのだろうか
// ただし、操作とその結果に出来上がる数列の並び順が違うのがまたややこしさを上げてる

fun main() {
    agc032a()
}

fun agc032a() {
    val n = readLine()!!.toInt()
    val b = readLine()!!.split(" ").map { it.toInt() }
    if (isImpossible(b)) {
        println(-1)
        return
    }
    val priorities = List(n) { PriorityQueue<Int>() }
    val ans = IntArray(n) { 0 }
    for (i in b.indices) {
        // 0indexなので1足してる(3番めにある3なら最後に挿入しても問題ない、という意味)
        // つまりこのpriorityとは挿入までの猶予を意味しているともいえそう
        // この値が大きいということは、それだけ早くに挿入しておかないとならない、ということになる
        val p = i - b[i]
        priorities[b[i] - 1].add(-p)
    }
    // 最初に挿入するのは必ず1
    var maxPosition = MaxPosition(0, 0)
    var priorityValue = Int.MAX_VALUE
    for (i in 0 until n) {
        priorityValue = Int.MAX_VALUE
        for (j in 0..i) {
            if (priorities[j].isEmpty()) continue
            val p = priorities[j].peek()
            if (p < priorityValue) {
                priorityValue = p
                maxPosition = MaxPosition(j + 1, j)
            }
        }
        priorities[maxPosition.index].poll()
        ans[i] = maxPosition.value
    }
    println(ans.joinToString("\n"))
}

private fun isImpossible(values: List<Int>): Boolean {
    for (i in values.indices) {
        if (values[i] > i + 1) return true
    }
    return false
}

private data class MaxPosition(val value: Int, val index: Int)