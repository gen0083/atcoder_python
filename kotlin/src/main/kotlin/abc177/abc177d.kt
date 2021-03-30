import java.lang.Integer.max
import kotlin.math.min

//

fun main() {
    abc177d()
}

fun abc177d() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val group = IntArray(n + 1) { it }
    val counts = IntArray(n + 1) { 1 }
    val pair = mutableSetOf<Pair<Int, Int>>()
    var maxSize = 1
    for (i in 0 until m) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        val p = min(a, b) to max(a, b)
        if (p in pair) continue
        pair.add(p)
        var ta = p.first
        var tb = p.second
        while (group[ta] != ta) {
            ta = group[ta]
        }
        group[p.first] = ta
        while (group[tb] != tb) {
            tb = group[tb]
        }
        group[p.second] = tb
        if (ta != group[tb]) {
            group[tb] = ta
            counts[ta] += counts[tb]
            maxSize = max(maxSize, counts[ta])
        }
    }
    println(maxSize)
}
