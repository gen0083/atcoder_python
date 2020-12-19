//

fun main() {
    abc186a()
}

fun abc186a() {
    val (n, w) = readLine()!!.split(" ").map { it.toInt() }
    println(n / w)
}
