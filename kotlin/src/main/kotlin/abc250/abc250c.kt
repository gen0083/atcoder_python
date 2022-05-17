//

fun main() {
    abc250c()
}

fun abc250c() {
    val (n, q) = readLine()!!.split(" ").map { it.toInt() }
    val a = (1..n).toMutableList()
    val b = (0 until n).toMutableList()
    repeat(q) {
        val x = readLine()!!.toInt()
        var i = b[x - 1]
        if (i == n - 1) i -= 1
        val j = a[i] - 1
        val k = a[i + 1] - 1
        val y = a[i]
        a[i] = a[i + 1]
        a[i + 1] = y
        val z = b[j]
        b[j] = b[k]
        b[k] = z
    }
    println(a.joinToString(" "))
}
