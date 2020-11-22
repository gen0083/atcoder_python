//

fun main() {
    abc184a()
}

fun abc184a() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    val (c, d) = readLine()!!.split(" ").map { it.toInt() }
    println(a * d - b * c)
}
