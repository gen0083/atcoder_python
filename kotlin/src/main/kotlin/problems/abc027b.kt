fun main() {
    abc027b()
}

fun abc027b() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    val total = a.sum()
    if (total % n != 0) {
        println(-1)
        return
    }
    val even = total / n
    var count = 0
    var remain = 0
    for (i in a) {
        if (i + remain == even) {
            remain = 0
            continue
        }
        remain = i + remain - even
        count++
    }
    println(count)
}