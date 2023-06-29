import kotlin.math.abs

fun main() {
    typical90_014()
}

fun typical90_014() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toLong() }.toList()
    val b = readLine()!!.split(" ").map { it.toLong() }.toList()
    val sa = a.sorted()
    val sb = b.sorted()
    println(sa.zip(sb).map { abs(it.first - it.second) }.sum())
}