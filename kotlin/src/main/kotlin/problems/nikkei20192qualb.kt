// https://atcoder.jp/contests/nikkei2019-2-qual/tasks/nikkei2019_2_qual_b

import kotlin.math.pow

fun main(args: Array<String>) {
    nikkei20192qualb()
}

fun nikkei20192qualb() {
    // TODO: 頭が真っ白になったら再挑戦するのもいいかもね
    val n = readLine()!!.toInt()
    val d = readLine()!!.split(" ").map { it.toInt() }
    val appear = d.groupingBy { it }.eachCount()
    val destinationMax = appear.keys.maxOrNull() ?: 0
    if (d.first() != 0 || appear[0] != 1) {
        println("0")
        return
    }
    var pattern = 1L
    for (i in 1..destinationMax) {
        val p = appear[i - 1] ?: 0
        val c = appear[i] ?: 0
        if (p == 0 || c == 0) {
            println(0)
            return
        }
        val f = p.toDouble().pow(c).toLong()
        pattern *= f
    }
    println(pattern % 998244353L)
}