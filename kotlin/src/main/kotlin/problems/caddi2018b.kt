// https://atcoder.jp/contests/caddi2018/tasks/caddi2018_b

fun main() {
    caddi2018b()
}

fun caddi2018b() {
    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val a = readLine()!!.toLong() % 2 == 1L
        if (a) {
            println("first")
            return
        }
    }
    println("second")
}