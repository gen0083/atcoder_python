//

fun main() {
    abc182a()
}

fun abc182a() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    val t = 2 * a + 100
    println(t - b)
}
