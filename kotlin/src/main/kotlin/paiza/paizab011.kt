fun main(args: Array<String>) {
    paizab011()
}

fun paizab011() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val b = m - 1
    val r = 2 * n
    val i = b % r
    val c = b / r
    val j = (r - i - 1) % r
    println(r * c + j + 1)
}