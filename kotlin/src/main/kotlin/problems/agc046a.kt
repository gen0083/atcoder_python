//

fun main() {
    agc046a()
}

fun agc046a() {
    val x = readLine()!!.toInt()
    var t = x
    var count = 1
    while (t != 0) {
        t += x
        t %= 360
        count++
    }
    println(count)
}
