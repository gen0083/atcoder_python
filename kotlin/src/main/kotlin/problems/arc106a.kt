import kotlin.math.pow

// TODO: pythonでACしたのでKotlinでもやってみる

fun main() {
    arc106a()
}

fun arc106a() {
    val n = readLine()!!.toLong()
    var t = n
    var a = 1L
    var b = 0L
    while (a < 10e18) {
        a = a.toDouble().pow(b.toDouble()).toLong()
        b++
        println("$b: $a")
    }
    while (t % 3L == 0L) {
        t /= 3L
        a++
    }
    while (t % 5L == 0L) {
        t /= 5L
        b++
    }
    if (t != 1L) {
        println(-1)
    } else {
        println("$a $b")
    }
}