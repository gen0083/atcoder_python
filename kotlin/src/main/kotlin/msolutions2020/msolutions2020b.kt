//

fun main() {
    msolutions2020b()
}

fun msolutions2020b() {
    val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }
    val k = readLine()!!.toInt()
    var t = b
    var i = 0
    while (t <= a) {
        t *= 2
        i++
    }
    var v = c
    while (v <= t) {
        v *= 2
        i++
    }
    println(if (i <= k) "Yes" else "No")
}
