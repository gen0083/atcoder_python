//

fun main() {
    abc176b()
}

fun abc176b() {
    val n = readLine()!!
    var t = 0
    for (c in n) {
        t += c.toString().toInt()
    }
    println(if (t % 9 == 0) "Yes" else "No")
}
