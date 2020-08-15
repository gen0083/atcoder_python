//

fun main() {
    abc175b()
}

fun abc175b() {
    val n = readLine()!!.toInt()
    val l = readLine()!!.split(" ").map { it.toLong() }
    var count = 0L
    for (i in 0 until n - 2) {
        for (j in i + 1 until n - 1) {
            if (l[i] == l[j]) continue
            for (k in j + 1 until n) {
                if (l[k] == l[i] || l[k] == l[j]) continue
                val array = listOf(l[i], l[j], l[k])
                val sorted = array.sortedDescending()
                if (sorted[0] < sorted[2] + sorted[1]) {
                    count++
                }
            }
        }
    }
    println(count)
}
