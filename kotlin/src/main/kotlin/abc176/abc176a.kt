//

fun main() {
    abc176a()
}

fun abc176a() {
    val (n, x, t) = readLine()!!.split(" ").map { it.toInt() }
    var time = n / x
    if (time * x < n) {
        time++
    }
    time *= t
    println(time)
}
