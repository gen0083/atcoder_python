//

fun main() {
    abc170a()
}

fun abc170a() {
    val x = readLine()!!.split(" ").map { it.toInt() }
    for (i in 0..4) {
        if (x[i] == 0) {
            println(i + 1)
        }
    }
}
