import java.util.*
import kotlin.math.max

fun main() {
    abc146d()
}

fun abc146d() {
    val n = readLine()!!.toInt()
    val edge = IntArray(n - 1) { 0 }
    val nodes = List(n + 1) { mutableSetOf<Int>() }
    val edgeOfNode = List(n + 1) { mutableSetOf<Int>() }
    var k = 0
    repeat(n - 1) { edgeId ->
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        nodes[a].add(b)
        nodes[b].add(a)
        edgeOfNode[a].add(edgeId)
        edgeOfNode[b].add(edgeId)
        val max_size = max(nodes[a].size, nodes[b].size)
        k = max(k, max_size)
    }
    val colorSet = (1..k).toSet()
    var start = 1
    while (nodes[start].size != 1) start++
    val visited = mutableSetOf<Int>()
    val nextNodes = ArrayDeque<Int>()
    nextNodes.add(start)
    while (visited.size < n) {
        val count = nextNodes.size
        for (i in 0 until count) {
            val from = nextNodes.poll()
            if (from in visited) continue
            visited.add(from)
            nextNodes.addAll(nodes[from])
            val paintEdge = mutableListOf<Int>()
            var usedColor = 0
            for (edgeId in edgeOfNode[from]) {
                if (edge[edgeId] == 0) {
                    paintEdge.add(edgeId)
                } else {
                    usedColor = edge[edgeId]
                }
            }
            for (e in paintEdge) {
                usedColor = nextColor(usedColor, k)
                edge[e] = usedColor
            }
        }
    }
    println(k)
    for (color in edge) {
        println(color)
    }
}

private fun nextColor(current: Int, k: Int): Int {
    val next = current + 1
    return if (next > k) 1 else next
}