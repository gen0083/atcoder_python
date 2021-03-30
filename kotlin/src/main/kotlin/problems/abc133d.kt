// https://atcoder.jp/contests/abc133/tasks/abc133_d

fun main() {
    abc133d()
}

fun abc133d() {
    val n = readLine()!!.toInt()
    val dum = readLine()!!.split(" ").map { it.toLong() }
    val rain = LongArray(n) { 0L }
    for (i in 1 until n) {
        rain[i] = dum[i - 1] - rain[i - 1]
    }
    val x = (dum.last() - rain.last()) / 2
    for (i in 0 until n) {
        if (i % 2 == 0) {
            rain[i] = (rain[i] + x) * 2
        } else {
            rain[i] = (rain[i] - x) * 2
        }
    }
    println(rain.joinToString(" "))
}
