//

fun main() {
    abc306a()
}

fun abc306a() {
    val n = readLine()!!.toInt()
    val s = readLine()!!
    val ans = buildString {
        for (c in s) {
            append(c)
            append(c)
        }
    }
    println(ans)
}
