import kotlin.math.min

//

fun main() {
    heroes4b()
}

fun heroes4b() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val (n, k1, k2) = readLine()!!.split(" ").map { it.toInt() }
        val s = readLine()!!
        var m = 0
        var p = 0
        for (i in 0 until n) {
            if (s[i] == '0') {
                p = 0
                continue
            }
            p = min(k1, k2 - p)
            m += p
        }
        println(m)
    }
}
