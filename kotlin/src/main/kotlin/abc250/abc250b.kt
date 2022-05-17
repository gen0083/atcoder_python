//

fun main() {
    abc250b()
}

fun abc250b() {
    val (n, a, b) = readLine()!!.split(" ").map { it.toInt() }
    var tile = Array(2) { ".".repeat(n * b) }
    for (i in 0 until n * b) {
        val j = i / b % 2
        val k = i % n
        tile[j] = tile[j].replaceRange(i..i, "#")
    }
    for (i in 0 until n * a) {
        val j = (i / a + 1) % 2
        println(tile[j])
    }
}
