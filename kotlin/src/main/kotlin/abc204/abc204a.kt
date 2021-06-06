//

fun main() {
    abc204a()
}

fun abc204a() {
    val (x, y) = readLine()!!.split(" ").map { it.toInt() }
    if (x == y) {
        println(x)
    } else {
        println(3 - x - y)
    }
}
