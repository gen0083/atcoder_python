//

fun main() {
    agc003b()
}

fun agc003b() {
    val n = readLine()!!.toInt()
    var count = 0L
    var next = 0L
    for (i in 1..n) {
        val m = readLine()!!.toLong()
        if (m == 0L) {
            next = 0L
        } else {
            count += (next + m) / 2
            next = (next + m) % 2
        }
    }
    println(count)
}
