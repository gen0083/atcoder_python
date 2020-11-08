import java.lang.Long.max

//

fun main() {
    abc182d()
}

fun abc182d() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toLong() }
    var t = 0L
    var p = 0L
    var maxMove = 0L
    var maxPoint = 0L
    for (l in a) {
        t += l
        maxMove = max(maxMove, t)
        maxPoint = max(maxPoint, max(p + maxMove, p + t))
        p += t
    }
    println(maxPoint)
}
