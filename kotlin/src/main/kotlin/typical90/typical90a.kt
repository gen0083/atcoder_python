import kotlin.math.min

fun main() {
    typical90a()
}

fun typical90a() {
    val (n, l) = readLine()!!.split(" ").map { it.toInt() }
    val k = readLine()!!.toInt()
    var j = 0
    val len = IntArray(n + 1) { 0 }
    for ((i, length) in readLine()!!.split(" ").map { it.toInt() }.withIndex()) {
        len[i] = length - j
        j = length
    }
    len[n] = l - j
    var left = 0
    var right = l
    while (left + 1 < right) {
        val x = (right + left) / 2
        var count = 0
        var piece = 0
        var m = l
        for (i in 0..n) {
            piece += len[i]
            if (piece >= x) {
                m = min(m, piece)
                piece = 0
                count++
            }
        }
        if (count > k) {
            left = x
        } else {
            right = x
        }
    }
    println("$left")
}