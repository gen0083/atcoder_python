// https://atcoder.jp/contests/abc006/tasks/abc006_2

fun main() {
    abc006b()
}

fun abc006b() {
    val n = readLine()!!.toInt()
    val toribonach = IntArray(n) { 0 }
    if (n < 3) {
        println(0)
        return
    }
    toribonach[2] = 1
    for (i in 3 until n) {
        toribonach[i] = (toribonach[i - 1] + toribonach[i - 2] + toribonach[i - 3]) % 10007
    }
    println(toribonach[n - 1])
}