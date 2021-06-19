//

fun main() {
    abc206b()
}

fun abc206b() {
    val n = readLine()!!.toLong()
    var count = 0L
    for (i in 1..n) {
        count += i
        if (count >= n) {
            println(i)
            return
        }
    }
}
