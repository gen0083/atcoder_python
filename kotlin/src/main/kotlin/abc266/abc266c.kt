//

fun main() {
    abc266c()
}

fun abc266c() {
    val x = Array(6) { 0 }
    val y = Array(6) { 0 }
    repeat(4) { i ->
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        x[i] = a + 100
        y[i] = b + 100
    }
    x[4] = x[0]
    x[5] = x[1]
    y[4] = y[0]
    y[5] = y[1]
    for (i in 1..4) {
        val ax = x[i + 1] - x[i]
        val ay = y[i + 1] - y[i]
        val bx = x[i - 1] - x[i]
        val by = y[i - 1] - y[i]
        if (ax * by - ay * bx <= 0) {
            println("No")
            return
        }
    }
    println("Yes")
}
