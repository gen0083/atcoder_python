//

fun main() {
    abc203a()
}

fun abc203a() {
    val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }
    when {
        a == b -> println(c)
        a == c -> println(b)
        b == c -> println(a)
        else -> println(0)
    }
}
