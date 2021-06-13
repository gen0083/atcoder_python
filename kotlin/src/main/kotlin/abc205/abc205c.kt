import kotlin.math.abs

//

fun main() {
    abc205c()
}

fun abc205c() {
    val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }
    if (a == b) {
        println("=")
        return
    }
    if (c % 2 == 0) {
        println(cat(a, b))
    } else {
        if (a > 0 && b > 0) {
            println(cat(a, b))
        } else if (a < 0 && b < 0) {
            if (a > b) {
                println("<")
            } else {
                println(">")
            }
        } else {
            if (a > b) {
                println(">")
            } else {
                println("<")
            }
        }
    }
}

private fun cat(a: Int, b: Int): String {
    val A = abs(a)
    val B = abs(b)
    return when {
        A > B -> ">"
        A < B -> "<"
        else -> "="
    }
}