//

fun main() {
    nomura2020a()
}

fun nomura2020a() {
    val (h1, m1, h2, m2, k) = readLine()!!.split(" ").map { it.toInt() }
    println(h2 * 60 + m2 - k - h1 * 60 - m1)
}
