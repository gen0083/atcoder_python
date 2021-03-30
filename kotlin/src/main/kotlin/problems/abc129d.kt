// https://atcoder.jp/contests/abc129/tasks/abc129_d

import kotlin.math.max

fun main() {
    abc129d()
}

fun abc129d() {
    val (h, w) = readLine()!!.split(" ").map { it.toInt() }
    val vertical = List<IntArray>(h) { IntArray(w + 1) { 0 } }
    val horizontal = List<IntArray>(h) { IntArray(w + 1) { 0 } }
    val vCount = IntArray(w + 1) { 0 }
    repeat(h) { height ->
        val s = readLine()!! + "#"
        // 番兵を用意して右端が.であってもカウントを正しく記録できるようにする
        var i = 0
        while (i <= w) {
            var t = 0
            var start = i
            while (s[i] == '.') {
                i++
                t++
            }
            for (j in start until i) {
                vertical[height][j] = t
                vCount[j]++
            }
            vertical[height][i] = 0
            for (k in (height - vCount[i]) until height) {
                horizontal[k][i] = vCount[i]
            }
            vCount[i] = 0
            horizontal[height][i] = 0
            i++
        }
    }
    // 上記処理では最後の縦のカウントが抜けてしまうのでrepeat外で最後の処理を行う
    for (i in 0 until w) {
        if (vCount[i] == 0) continue
        for (k in (h - vCount[i]) until h) {
            horizontal[k][i] = vCount[i]
        }
    }
    var max_size = 0
    for (i in 0 until h) {
        for (j in 0 until w) {
            // マスi,jにおいて縦に連続する.と横に連続する.の数を記録しているのでこれを加算し、
            // 重複する自身のマス分の1を減らした数がi,jにランプを置いた際に照らされるマスの数になる
            max_size = max(vertical[i][j] + horizontal[i][j] - 1, max_size)
        }
    }
    println(max_size)
}