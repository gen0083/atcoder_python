import kotlin.math.max

//

fun main() {
    abc175d()
}

fun abc175d() {
    val (ns, ks) = readLine()!!.split(" ")
    val n = ns.toInt()
    val k = ks.toLong()
    val p = readLine()!!.split(" ").map { it.toInt() - 1 }
    val c = readLine()!!.split(" ").map { it.toLong() }
    val loops = mutableListOf<MutableSet<Int>>()
    val visited = mutableSetOf<Int>()
    var i = 0
    while (visited.size < n) {
        if (i in visited) {
            i++
            continue
        }
        val set = mutableSetOf<Int>()
        var j = p[i]
        while (j !in visited) {
            set.add(j)
            visited.add(j)
            j = p[j]
        }
        loops.add(set)
    }
    val remain = IntArray(loops.size)
    val possibleMax = LongArray(loops.size) { Long.MIN_VALUE }
    for ((i, list) in loops.withIndex()) {
        var r = (k % list.size).toInt()
        if (r == 0) r = list.size
        remain[i] = r
        for (j in list) {
            var next = p[j]
            var maxPoint = c[next]
            var point = 0L
            repeat(r) {
                point += c[next]
                next = p[next]
                maxPoint = max(maxPoint, point)
            }
            possibleMax[i] = max(possibleMax[i], maxPoint)
        }
    }
    val maxPair = possibleMax.mapIndexed { index, l -> index to l }
    val max = maxPair.maxByOrNull { it.second }!!
    var ans = max.second
    var sum = 0L
    for (i in loops[max.first]) {
        sum += c[i]
    }
    if (sum > 0L) {
        val count = k / loops[max.first].size
        ans += (sum * count)
        if (remain[max.first] == loops[max.first].size) ans -= sum
    }
    println(ans)
}
