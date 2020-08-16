import kotlin.math.max

//

fun main() {
    abc175d()
}

fun abc175d() {
    val (ns, ks) = readLine()!!.split(" ")
    val n = ns.toInt()
    val k = ks.toLong()
    val p = readLine()!!.split(" ").map { it.toInt() - 1 }
    val c = readLine()!!.split(" ").map { it.toLong() }
    var r = (k % n).toInt()
    if (r == 0) r = n
    val points = LongArray(n) { 0L }
    for (i in 0 until n) {
        var j = p[i]
        var maxPoint = c[j]
        var point = 0L
        repeat(r) {
            point += c[j]
            j = p[j]
            maxPoint = max(maxPoint, point)
        }
        points[i] = maxPoint
    }
    var ans = points.max()!!
    val sum = c.sum()
    if (sum > 0L) {
        val count = k / n
        ans += (sum * count)
    }
    println(ans)
    println(29507023469L)
    println(18904263608)
    println(1000000000000000000)
}
