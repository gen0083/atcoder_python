import kotlin.math.min

//

fun main() {
    abc180d()
}

fun abc180d() {
    val (x, y, a, b) = readLine()!!.split(" ").map { it.toLong() }
    val goal = y - 1L
    val m = min(goal, x + b)
    var at = 0
    var t = x
    while (t <= m) {
        t *= a
        at++
    }
    val bt = ((goal - x * a * at) / b).coerceAtLeast(0L)
    println(at + bt)
    println(2 / 4)
}