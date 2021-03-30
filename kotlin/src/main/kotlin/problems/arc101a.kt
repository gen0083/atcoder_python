import java.lang.Long.max
import java.lang.Long.min
import kotlin.math.abs

fun main() {
    arc101a()
}

fun arc101a() {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    val x = readLine()!!.split(" ").map { it.toLong() }
    // sumする必要はない　leftからk個分移動するだけなので、その間の要素の値がなんであろうと無視できる
    var r = Long.MAX_VALUE
    var minRange = r
    for (i in k - 1 until n) {
        val left = x[i - k + 1]
        val right = x[i]
        r = if (left > 0 || right < 0) {
            // 両辺の正負が同じ場合は絶対値の大きいほうが移動コストになる
            max(abs(left), abs(right))
        } else {
            // 両辺の正負が異なる場合は
            val al = abs(left)
            al + right + min(al, right)
        }
        minRange = min(r, minRange)
    }
    println(minRange)
}