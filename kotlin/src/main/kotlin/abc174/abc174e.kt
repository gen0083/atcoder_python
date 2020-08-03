//

fun main() {
    abc174e()
}

fun abc174e() {
    val (n, k) = readLine()!!.split(" ").map { it.toLong() }
    val a = readLine()!!.split(" ").map { it.toLong() }
    val counts = LongArray(n.toInt()) { 0L }
    val total = a.sum()
    if (total <= k) {
        println(1)
        return
    }
    var count = k + 1
    var i = n.toInt() - 1
    while (count > k) {
        val t = a[i]
        for (j in 0 until i) {
        
        }
    }
}
