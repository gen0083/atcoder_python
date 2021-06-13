//

fun main() {
    abc205b()
}

fun abc205b() {
    val n = readLine()!!.toInt()
    val b = readLine()!!.split(" ").map { it.toInt() }
    val sorted = b.sorted()
    for (i in 1..n) {
        if (sorted[i - 1] != i) {
            println("No")
            return
        }
    }
    println("Yes")
}
