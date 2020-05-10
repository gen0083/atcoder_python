//

fun main() {
    abc167a()
}

fun abc167a() {
    val s = readLine()!!
    val t = readLine()!!
    val u = t.substring(0 until t.lastIndex)
    if (s == u) {
        println("Yes")
    } else {
        println("No")
    }
}
