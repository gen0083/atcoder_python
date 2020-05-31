//

fun main() {
    abc169a()
}

fun abc169a() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    println(a * b)
}
