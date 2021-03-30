import java.lang.Long.max

fun main() {
    abc183d()
}

fun abc183d() {
    val (nl, w) = readLine()!!.split(" ").map { it.toLong() }
    val n = nl.toInt()
    val periods = LongArray(200001)
    var m = 0L
    // 当然TLEというのはわかってたのだが、これ以外の解法が思いつかなかった
    //    for (i in 0 until n) {
    //        val (sl, tl, p) = readLine()!!.split(" ").map { it.toLong() }
    //        val s = sl.toInt()
    //        val t = tl.toInt()
    //        for (i in s until t) {
    //            periods[i] += p
    //            m = max(m, periods[i])
    //            if (m > w) {
    //                println("No")
    //                return
    //            }
    //        }
    //    }
    repeat(n) {
        val (s, t, p) = readLine()!!.split(" ").map { it.toLong() }
        periods[s.toInt()] += p
        periods[t.toInt()] -= p
    }
    var total = 0L
    for (i in 0 until n) {
        total += periods[i]
        m = max(m, total)
        if (m > w) {
            println("No")
            return
        }
    }
    println("Yes")
}
