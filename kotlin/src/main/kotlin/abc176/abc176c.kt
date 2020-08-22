import java.lang.Long.max

//

fun main() {
    abc176c()
}

fun abc176c() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toLong() }
    var d = 0L
    var p = a[0]
    for (l in a) {
        if (l < p) {
            d += (p - l)
        }
        p = max(p, l)
    }
    println(d)
}
