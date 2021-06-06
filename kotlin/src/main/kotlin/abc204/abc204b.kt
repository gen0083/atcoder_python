//

fun main() {
    abc204b()
}

fun abc204b() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    var count = 0
    for (nuts in a) {
        if (nuts > 10) count += nuts - 10
    }
    println(count)
}
