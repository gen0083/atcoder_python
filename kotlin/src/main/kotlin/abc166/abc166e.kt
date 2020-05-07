// https://atcoder.jp/contests/abc166/tasks/abc166_e

fun main() {
    abc166e()
}

fun abc166e() {
    val n = readLine()!!.toInt()
    val height = readLine()!!.split(" ").map { it.toInt() }
    var count = 0
    //    for (i in 0 until n) {
    //        var sa = height[i]
    //        while(i + sa < n) {
    //            if (height[i] + height[i + sa] == sa) {
    //                count++
    //            }
    //            sa++
    //        }
    //    }
    val mj = mutableMapOf<Int, Int>()
    val mi = height.mapIndexed { i, e ->
        val sa = i - e
        val c = mj.getOrDefault(sa, 0) + 1
        mj[sa] = c
        i + e
    }
    for (e in mi) {
        count += mj.getOrDefault(e, 0)
    }
    println(count)
}