// https://atcoder.jp/contests/abc204/tasks/abc204_d
// 部分和問題　だろうなとは思いつつも理解するところまでやってないから結局わからないっていうね

fun main() {
    abc204d()
}

fun abc204d() {
    val n = readLine()!!.toInt()
    val t = readLine()!!.split(" ").map { it.toInt() }
    val time = t.sortedDescending()
    var m = time.sum()
    for (i in 0 until n) {
        var total = time.sum() - time[i]
        var other = time[i]
        for (j in i + 1 until n) {

        }
    }
    println(m)
}
