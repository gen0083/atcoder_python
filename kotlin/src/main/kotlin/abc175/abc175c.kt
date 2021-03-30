import kotlin.math.abs

//

fun main() {
    abc175c()
}

fun abc175c() {
    val (x, k, d) = readLine()!!.split(" ").map { it.toLong() }
    val xx = abs(x)
    var temp = xx / d
    if (temp >= k) {
        println(xx - (d * k))
        return
    }
    val remain = k - temp
    val t = xx - temp * d
    if (remain % 2 == 0L) {
        // この座標が答え
        println(abs(t))
    } else {
        println(abs(t - d))
    }
}
