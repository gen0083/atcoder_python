//

fun main() {
    abc179c()
}

fun abc179c() {
    val n = readLine()!!.toInt()
    val table = IntArray(n) { 1 }
    table[0] = 0
    for (a in 2 until n) {
        var b = 1
        while (a * b <= n - 1) {
            table[a * b] += 1
            b++
        }
    }
    println(table.sum())
}
