//

fun main() {
    abc168b()
}

fun abc168b() {
    val n = readLine()!!.toInt()
    val s = readLine()!!
    if (s.length <= n) {
        println(s)
    } else {
        println("${s.substring(0, n)}...")
    }
}
