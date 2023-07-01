//

fun main() {
    abc308c()
}

fun abc308c() {
    val n = readLine()!!.toInt()
    val c = mutableListOf<Pair<Int, Double>>()
    repeat(n) {
        val (a, b) = readLine()!!.split(" ").map { it.toLong() }
        if (a == 0L) {
            c.add(it + 1 to 0.0)
        } else {
            c.add(it + 1 to ((a + b.toDouble()) / a.toDouble()))
        }
    }
    c.sortBy { it.second }
    println(c.joinToString(separator = " ") { it.first.toString() })
}
