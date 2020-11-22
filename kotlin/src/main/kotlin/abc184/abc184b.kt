//

fun main() {
    abc184b()
}

fun abc184b() {
    val (n, x) = readLine()!!.split(" ").map { it.toInt() }
    val s = readLine()!!
    var point = x
    for (c in s) {
        if (c == 'o') {
            point++
        } else {
            point = (point - 1).coerceAtLeast(0)
        }
    }
    println(point)
}
