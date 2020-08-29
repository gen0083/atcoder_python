//

fun main() {
    abc177a()
}

fun abc177a() {
    val (d, t, s) = readLine()!!.split(" ").map { it.toInt() }
    println(if (t * s >= d) "Yes" else "No")
}
