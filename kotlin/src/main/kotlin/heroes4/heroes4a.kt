//

fun main() {
    heroes4a()
}

fun heroes4a() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val (n, k) = readLine()!!.split(" ").map { it.toLong() }
        val base = k * k * k + k * k + k + 1
        val f = n / base
        println("$f ${f * k} ${f * k * k} ${f * k * k * k}")
    }
}
