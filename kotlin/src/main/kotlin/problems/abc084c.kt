// https://atcoder.jp/contests/abc084/tasks/abc084_c

fun main(args: Array<String>) {
    abc084c()
}

fun abc084c() {
    val n = readLine()!!.toInt()
    val stations = mutableListOf<Station>()
    for (i in 0 until n - 1) {
        val (c, s, f) = readLine()!!.split(" ").map { it.toInt() }
        stations.add(Station(c, s, f))
    }
    val arrivedAt = IntArray(n) { 0 }
    for (i in 0 until n - 1) {
        val time = stations[i].run { cost + start }
        arrivedAt[i] = time
        for (j in 0 until i) {
            if (arrivedAt[j] < stations[i].start) {
                arrivedAt[j] = time
            } else {
                val nextTrain = Math.ceil(arrivedAt[j] / stations[i].interval.toDouble())
                    .toInt() * stations[i].interval
                arrivedAt[j] = nextTrain + stations[i].cost
            }
        }
    }
    for (t in arrivedAt) {
        println(t)
    }
}

private data class Station(val cost: Int, val start: Int, val interval: Int)