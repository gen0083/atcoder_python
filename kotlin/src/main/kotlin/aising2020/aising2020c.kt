// https://atcoder.jp/contests/aising2020/tasks/aising2020_c

fun main() {
    aising2020c()
}

fun aising2020c() {
    // ある意味販促みたいな解き方だけど、x,y,zの組み合わせで限界となる数値を力技で求めて、
    // それが98だったので三重ループで全探索した
    val n = readLine()!!.toInt()
    val count = IntArray(n) { 0 }
    for (x in 1..98) {
        for (y in 1..98) {
            for (z in 1..98) {
                val r = func(x, y, z)
                if (r <= n) {
                    count[r - 1]++
                }
            }
        }
    }
    for (ans in count) {
        println(ans)
    }
}

private fun func(x: Int, y: Int, z: Int): Int {
    return x * (x + y) + y * (y + z) + z * (z + x)
}