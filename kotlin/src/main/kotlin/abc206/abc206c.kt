//

fun main() {
    abc206c()
}

fun abc206c() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toLong() }
    val s = a.groupingBy { it }.eachCount()
    var count = 0L
    var t = n.toLong()
    for (i in s.values) {
        t -= i
        count += (t * i)
    }
    println(count)
}
