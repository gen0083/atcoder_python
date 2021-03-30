//

fun main() {
    arc040b()
}

fun arc040b() {
    val (n, r) = readLine()!!.split(" ").map { it.toInt() }
    val s = readLine()!!
    if (!s.contains('.')) {
        // すべて.なら不要
        println(0)
        return
    }
    val end = s.lastIndexOf('.')
    if (end < r) {
        // 最後の.がrの範囲内にあるなら一回塗れば終わり
        println(1)
        return
    }
    // endはindexなのでそもそも-1されており、＋2することで最後のマスを塗るのに必要な移動距離が求まる
    var count = end - r + 2
    // のこりは道中で何回塗ればよいかをもとめればよい
    var i = 0
    while (i <= end - r) {
        if (s[i] == '.') {
            count++
            i += r
        } else {
            i++
        }
    }
    println(count)
}