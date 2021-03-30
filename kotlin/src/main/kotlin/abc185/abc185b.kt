//

fun main() {
    abc185b()
}

fun abc185b() {
    val (n, m, t) = readLine()!!.split(" ").map { it.toInt() }
    var battery = n
    var now = 0
    repeat(m) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        val past = a - now
        if (battery <= past) {
            println("No")
            return
        }
        battery -= past
        val charge = b - a
        battery = (battery + charge).coerceAtMost(n)
        now = b
    }
    val past = t - now
    if (battery <= past) {
        println("No")
    } else {
        println("Yes")
    }
}
