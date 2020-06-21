//

fun main() {
    abc171b()
}

fun abc171b() {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    val p = readLine()!!.split(" ").map { it.toInt() }
    val sorted = p.sorted()
    var sum = 0
    for (i in 0 until k) {
        sum += sorted[i]
    }
    println(sum)
}
