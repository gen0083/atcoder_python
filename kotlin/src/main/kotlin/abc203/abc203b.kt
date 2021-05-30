//

fun main() {
    abc203b()
}

fun abc203b() {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    var count = 0
    for (i in 1..n) {
        for (j in 1..k) {
            count += i * 100 + j
        }
    }
    println(count)
}
