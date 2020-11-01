//

fun main() {
    abc181b()
}

fun abc181b() {
    val n = readLine()!!.toInt()
    var total = 0L
    repeat(n) {
        val (a, b) = readLine()!!.split(" ").map { it.toLong() }
        total += ((a + b) * (b - a + 1L) / 2L)
    }
    println(total)
}
