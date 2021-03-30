// https://atcoder.jp/contests/abc140/tasks/abc140_d
// LとRの連続してる数が問題なのではないか、そして複数の塊を反転させるよりも
// 境界となっているところを反転させるだけで答えが導き出せるんじゃないかというところまでは着想できた
// しかし結局一回の操作で幸福な人は2人しか増えない、という構造には気づかなかった
// 最終的に求めたいものは幸福な人の数、幸福な人の数の求め方に「幸福でない人の数」を導入するのはなるほどという感じ
// 確かに他の問題でも、この逆説的な観点から解答を導くパターンの問題がいくつかある気がする

fun main() {
    abc140d()
}

fun abc140d() {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    val num = mutableListOf<Int>()
    var count = 0
    var p = ' '
    for (e in readLine()!!) {
        if (p != e) {
            p = e
            if (count > 0) num.add(count)
            count = 1
        } else {
            count++
        }
    }
    num.add(count)
    var precious = n - num.size
    if (num.size > k * 2) {
        precious += k * 2
    } else {
        precious = n - 1
    }
    println(precious)
}