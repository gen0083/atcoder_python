// https://atcoder.jp/contests/abc048/tasks/arc064_a

fun main() {
    abc048c()
}

fun abc048c() {
    val (ns, xs) = readLine()!!.split(" ")
    val n = ns.toInt()
    val x = xs.toLong()
    val a = readLine()!!.split(" ").map { it.toLong() }.toTypedArray()
    var count = 0L
    for (i in 1 until n) {
        val sum = a[i] + a[i - 1]
        if (sum > x) {
            val eat = sum - x
            count += eat
            a[i] = (a[i] - eat).coerceAtLeast(0)
        }
    }
    println(count)
}