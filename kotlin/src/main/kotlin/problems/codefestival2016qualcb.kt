// https://atcoder.jp/contests/code-festival-2016-qualc/tasks/codefestival_2016_qualC_b

fun main(args: Array<String>) {
    codefestival2016qualcb()
}

fun codefestival2016qualcb() {
    val (n, t) = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toInt() }.sortedDescending()
    var r = 0
    for (i in a) {
        r = Math.abs(r - i)
    }
    println(if (r > 0) r - 1 else r)
}