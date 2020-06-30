fun main() {
    abc160e()
}

private const val MAX_VALUE = 1_000_000_001L

fun abc160e() {
    val (x, y, a, b, c) = readLine()!!.split(" ").map { it.toLong() }
    val p = readLine()!!.split(" ").map { it.toLong() }.sortedDescending().toMutableList()
    val q = readLine()!!.split(" ").map { it.toLong() }.sortedDescending().toMutableList()
    val r = readLine()!!.split(" ").map { it.toLong() }.sortedDescending()
    var i = x.toInt()
    var j = y.toInt()
    var k = 0
    var taste = p.subList(0, i).sum() + q.subList(0, j).sum()
    p.add(0, MAX_VALUE)
    q.add(0, MAX_VALUE)
    while (k < c && (p[i] < r[k] || q[j] < r[k])) {
        val minus = if (p[i] < q[j]) {
            i--
            p[i + 1]
        } else {
            j--
            q[j + 1]
        }
        taste += r[k] - minus
        k++
    }
    println(taste)
}