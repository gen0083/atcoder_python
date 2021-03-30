// https://atcoder.jp/contests/aising2020/tasks/aising2020_b

fun main() {
    aising2020b()
}

fun aising2020b() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    var count = 0
    for ((i, v) in a.withIndex()) {
        if (i % 2 == 0 && v % 2 == 1) count++
    }
    println(count)
}
