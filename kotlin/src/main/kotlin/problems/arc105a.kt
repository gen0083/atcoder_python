//

fun main() {
    arc105a()
}

fun arc105a() {
    val (a, b, c, d) = readLine()!!.split(" ").map { it.toInt() }
    val sum = a + b + c + d
    if (sum % 2 == 1) {
        println("No")
    } else {
        val half = sum / 2
        if (half in intArrayOf(
                a, b, c, d,
                a + b, a + c, a + d,
                a + b + c, a + b + d, a + c + d,
                b + c, b + d, b + c + d,
                c + d
            )) {
            println("Yes")
        } else {
            println("No")
        }
    }
}