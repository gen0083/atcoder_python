import java.lang.Long.max

//

fun main() {
    abc085d()
}

fun abc085d() {
    val (ns, hs) = readLine()!!.split(" ")
    val n = ns.toInt()
    var h = hs.toLong()
    var aMax = 0L
    val thr = mutableListOf<Long>()
    repeat(n) {
        val (a, b) = readLine()!!.split(" ").map { it.toLong() }
        aMax = max(aMax, a)
        thr.add(b)
    }
    var count = 0L
    val sorted = thr.sortedDescending()
    var i = 0
    while (h > 0L) {
        val k = if (i < n) sorted[i] else 0L
        if (k > aMax) {
            h -= k
            i++
            count++
        } else {
            val r = h / aMax
            h -= aMax * r
            count += r
            if (h > 0L) {
                h -= aMax
                count++
            }
        }
    }
    println(count)
}