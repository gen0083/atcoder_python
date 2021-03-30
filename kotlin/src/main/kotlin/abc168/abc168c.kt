import kotlin.math.PI
import kotlin.math.abs
import kotlin.math.cos
import kotlin.math.sqrt

// https://atcoder.jp/contests/abc168/tasks/abc168_c

fun main() {
    abc168c()
}

fun abc168c() {
    val (a, b, h, m) = readLine()!!.split(" ").map { it.toDouble() }
    val deltaA = 30 * h + m * 0.5
    val deltaB = 6 * m
    val delta = abs(deltaA - deltaB)
    val rad = delta * PI / 180.0
    val cos = cos(rad)
    val x = sqrt(a * a + b * b - 2 * a * b * cos)
    println(x)
}
