import java.lang.Integer.max

fun main() {
    divelta2019_2b()
}

fun divelta2019_2b() {
    val n = readLine()!!.toInt()
    val plots = mutableListOf<Pair<Long, Long>>()
    repeat(n) {
        val (x, y) = readLine()!!.split(" ").map { it.toLong() }
        plots.add(x to y)
    }
    val lines = mutableMapOf<Pair<Long, Long>, Int>()
    var max_count = 0
    for (i in 0 until n - 1) {
        for (j in i + 1 until n) {
            val p = plots[i].first - plots[j].first
            val q = plots[i].second - plots[j].second
            val plot = p to q
            lines[plot] = lines.getOrDefault(plot, 0) + 1
            max_count = max(max_count, lines[plot]!!)
        }
    }
    val line_count = lines.count { it.value == max_count }
    val count = line_count * (max_count + 1)
    if (count == n) {
        println(line_count)
    } else {
        println(line_count + n - count)
    }
}