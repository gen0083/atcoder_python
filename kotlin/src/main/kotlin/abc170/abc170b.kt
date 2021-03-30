//

fun main() {
    abc170b()
}

fun abc170b() {
    val (x, y) = readLine()!!.split(" ").map { it.toInt() }
    for (i in 0..x) {
        val z = x - i
        if (i * 2 + z * 4 == y) {
            println("Yes")
            return
        }
    }
    println("No")
}
