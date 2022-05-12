import java.lang.Integer.min

//

fun main() {
    abc186b()
}

fun abc186b() {
    val (h, w) = readLine()!!.split(" ").map { it.toInt() }
    var m = 100
    var total = 0
    repeat(h) {
        val a = readLine()!!.split(" ").map { it.toInt() }
        m = min(m, a.minOrNull()!!)
        total += a.sum()
    }
    val target = m * h * w
    println(total - target)
}
