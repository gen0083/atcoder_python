import kotlin.math.abs
import kotlin.math.min

fun main() {
    typical90_007()
}

fun typical90_007() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    val q = readLine()!!.toInt()
    val sorted = a.sorted()
    repeat(q) {
        val b = readLine()!!.toInt()
        var left = 0
        var right = n - 1
        while (left + 1 < right) {
            val c = (left + right) / 2
            if (b <= sorted[c]) {
                right = c
            } else {
                left = c
            }
        }
        var m = min(abs(sorted[left] - b), abs(sorted[right] - b))
        println(m)
    }
}