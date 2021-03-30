//

fun main() {
    abc170c()
}

fun abc170c() {
    val (x, n) = readLine()!!.split(" ").map { it.toInt() }
    if (n == 0) {
        println(x)
        return
    }
    val p = readLine()!!.split(" ").map { it.toInt() }.toSet()
    for (i in 0..101) {
        if (x - i !in p) {
            println(x - i)
            return
        }
        if (x + i !in p) {
            println(x + i)
            return
        }
    }
}
