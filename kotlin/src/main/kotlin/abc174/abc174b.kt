import kotlin.math.pow
import kotlin.math.sqrt

//

fun main() {
    abc174b()
}

fun abc174b() {
    val (n, d) = readLine()!!.split(" ").map { it.toInt() }
    var count = 0
    repeat(n) {
        val (x, y) = readLine()!!.split(" ").map { it.toLong() }
        if (sqrt(x.toDouble().pow(2.0) + y.toDouble().pow(2.0)) <= d) {
            count++
        }
    }
    println(count)
}
