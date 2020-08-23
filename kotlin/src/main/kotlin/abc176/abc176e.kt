import java.util.*

//

fun main() {
    abc176e()
}

fun abc176e() {
    val (h, w, m) = readLine()!!.split(" ").map { it.toInt() }
    val bom = mutableListOf<Pair<Int, Int>>()
    val ih = List<MutableSet<Int>>(h + 1) { mutableSetOf() }
    val iw = List<MutableSet<Int>>(w + 1) { mutableSetOf() }
    repeat(m) { i ->
        val (x, y) = readLine()!!.split(" ").map { it.toInt() }
        bom.add(x to y)
        ih[x].add(i)
        iw[y].add(i)
    }
    val visited = mutableSetOf<Int>()
    val group = mutableListOf<MutableSet<Int>>()
    var i = 0
    val next = ArrayDeque<Int>()
    var g = mutableSetOf<Int>()
    while (visited.size < m && i < m) {
        var t = i
        if (next.isNotEmpty()) {
            t = next.poll()
        } else {
            if (g.isNotEmpty()) {
                group.add(g)
                g = mutableSetOf()
            }
            i++
        }
        if (t in visited) continue
        visited.add(t)
        g.add(t)
        val b = bom[t]
        next.addAll(ih[b.first])
        next.addAll(iw[b.second])
    }
    if (g.isNotEmpty()) group.add(g)
    if (group.size == 1) {
        println(group[0].size)
    } else {
        val sorted = group.sortedByDescending { it.size }
        println(sorted[0].size + sorted[1].size)
    }
}
