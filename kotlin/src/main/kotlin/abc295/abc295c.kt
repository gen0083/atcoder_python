//

fun main() {
    abc295c()
}

fun abc295c() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toLong() }
    val g = a.groupingBy { it }.eachCount()
    var ans = 0
    for (count in g.values) {
        ans += count / 2
    }
    println(ans)
}
