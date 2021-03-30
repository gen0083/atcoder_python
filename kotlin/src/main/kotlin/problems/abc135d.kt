// https://atcoder.jp/contests/abc135/tasks/abc135_d
// TODO: try someday

fun main() {
    abc135d()
}

fun abc135d() {
    val s = readLine()!!
    var i = 0
    while (i * 13 + 5 < 1000000) {
        val t = i * 13 + 5
        if (t % 10 == 1) {
            println("${i + 1}: $t")
        }
        i++
    }
}