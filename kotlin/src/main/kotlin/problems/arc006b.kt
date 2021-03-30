// https://atcoder.jp/contests/arc006/tasks/arc006_2

fun main() {
    arc006b()
}

fun arc006b() {
    val (n, l) = readLine()!!.split(" ").map { it.toInt() }
    // 0および2*n+1は番兵として空白を用意しておく
    val amida = MutableList<String>(l) { "" }
    for (i in 0 until l) {
        val line = readLine()!!
        amida[i] = " $line "
    }
    val goal = readLine()!!.indexOf('o') + 1
    var selected = goal
    for (i in l - 1 downTo 0) {
        when {
            amida[i][selected - 1] == '-' -> selected -= 2
            amida[i][selected + 1] == '-' -> selected += 2
            else                          -> Unit
        }
    }
    println(selected / 2 + 1)
}
