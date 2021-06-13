//

fun main() {
    abc205a()
}

fun abc205a() {
    val (a, b) = readLine()!!.split(" ").map { it.toDouble() }
    println(a * b / 100.0)
}
