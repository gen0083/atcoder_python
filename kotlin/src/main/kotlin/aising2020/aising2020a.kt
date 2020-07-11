// https://atcoder.jp/contests/aising2020/tasks/aising2020_a

fun main() {
    aising2020a()
}

fun aising2020a() {
    val (l, r, d) = readLine()!!.split(" ").map { it.toInt() }
    var count = 0
    var k = 1
    while (k * d <= r) {
        if (k * d in l..r) count++
        k++
    }
    println(count)
}
