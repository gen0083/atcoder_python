import kotlin.math.max

//

fun main() {
    abc178b()
}

fun abc178b() {
    val (a, b, c, d) = readLine()!!.split(" ").map { it.toLong() }
    var ans = a * c
    ans = max(ans, a * d)
    ans = max(ans, b * c)
    ans = max(ans, b * d)
    println(ans)
}
