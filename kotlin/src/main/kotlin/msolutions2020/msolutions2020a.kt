//

fun main() {
    msolutions2020a()
}

fun msolutions2020a() {
    val n = readLine()!!.toInt()
    val ans = when (n) {
        in 1800..1999 -> 1
        in 1600..1799 -> 2
        in 1400..1599 -> 3
        in 1200..1399 -> 4
        in 1000..1199 -> 5
        in 800..999   -> 6
        in 600..799   -> 7
        else          -> 8
    }
    println(ans)
}
