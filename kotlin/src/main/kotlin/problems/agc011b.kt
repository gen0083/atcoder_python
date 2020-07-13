// https://atcoder.jp/contests/agc011/tasks/agc011_b

fun main() {
    agc011b()
}

fun agc011b() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toLong() }.sorted()
    var survive = 1
    var creature = a[0]
    for (i in 0 until n - 1) {
        if (creature * 2 >= a[i + 1]) {
            survive++
        } else {
            survive = 1
        }
        creature += a[i + 1]
    }
    println(survive)
}
