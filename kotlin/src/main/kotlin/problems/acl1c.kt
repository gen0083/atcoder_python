import java.lang.Integer.min

//

fun main() {
    acl1c()
}

fun acl1c() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val cities = IntArray(n + 1) { 0 }
    repeat(m) {
        val targets = readLine()!!.split(" ").map { it.toInt() }
        val parents = intArrayOf(cities[targets[0]], cities[targets[1]])
        for ((i, t) in parents.withIndex()) {
            var tmp = t
            while (tmp != 0 && tmp != cities[tmp]) {
                tmp = cities[tmp]
            }
            if (tmp == 0) parents[i] = targets[i]
        }
        val parent = min(parents[0], parents[1])
        for (i in 0..1) {
            cities[targets[i]] = parent
            cities[parents[i]] = parent
        }
    }
    var count = 0
    for (i in 1..n) {
        if (cities[i] == i || cities[i] == 0) count++
    }
    println(count - 1)
}