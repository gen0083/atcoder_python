fun main(args: Array<String>) {
    abc040c()
}

fun abc040c() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    val cost = IntArray(n) { 0 }
    cost[0] = 0
    cost[1] = Math.abs(a[1] - a[0])
    for (i in 2 until n) {
        cost[i] = Math.min(Math.abs(a[i] - a[i - 1]) + cost[i - 1],
            Math.abs(a[i] - a[i - 2]) + cost[i - 2])
    }
    println(cost.last())
}