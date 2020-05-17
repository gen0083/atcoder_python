import kotlin.math.PI
import kotlin.math.abs
import kotlin.math.cos
import kotlin.math.sqrt

//

fun main() {
    abc168c()
}

fun abc168c() {
    val (a, b, h, m) = readLine()!!.split(" ").map { it.toDouble() }
    val deltaA = 30 * h + m / 720
    val deltaB = 6 * m
    val delta = abs(deltaA - deltaB) % 180
    if (a == b) {
        println(a * 2 * PI * delta / 360.0)
        return
    }
    when (delta) {
        // 重なってる場合はaとbの差
        0.0  -> println(abs(a - b))
        90.0 -> println(sqrt(a * a + b * b))
        
        else -> {
            val rad = delta * PI / 180.0
            val cos = cos(rad)
            val x = sqrt(a * a + b * b - 2 * a * b * cos)
            println(x)
        }
    }
}
