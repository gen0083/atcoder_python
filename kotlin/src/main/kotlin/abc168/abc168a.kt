//

fun main() {
    abc168a()
}

fun abc168a() {
    val n = readLine()!!.toInt()
    val c = when (n % 10) {
        in listOf(0, 1, 6, 8) -> "pon"
        3                     -> "bon"
        else                  -> "hon"
    }
    println(c)
}
