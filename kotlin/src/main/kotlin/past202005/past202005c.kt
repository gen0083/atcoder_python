import java.lang.Math.pow

//

fun main() {
    past202005c()
}

fun past202005c() {
    val (a, r, n) = readLine()!!.split(" ").map { it.toLong() }
    val result = pow(r.toDouble(), (n - 1).toDouble()).toLong() * a
    // オーバーフローするわな
    if (result > 1_000_000_000L || result < 0) {
        println("large")
    } else {
        println(result)
    }
}
