import kotlin.math.max

fun main() {
    abc146d()
}

fun abc146d() {
    val n = readLine()!!.toInt()
    val edge = MutableList(n - 1) { 0 to 0 }
    val nodes = List(n + 1) { mutableSetOf<Int>() }
    var k = 0
    repeat(n - 1) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        edge[it] = a to b
        nodes[a].add(b)
        nodes[b].add(a)
        val max_size = max(nodes[a].size, nodes[b].size)
        k = max(k, max_size)
    }
    val colorSet = (1..k).toSet()
    val colors = List(n + 1) { mutableSetOf<Int>() }
    println(k)
    for (e in edge) {
        val nodeA = e.first
        val nodeB = e.second
        val used = colors[nodeA].union(colors[nodeB])
        val color = colorSet.minus(used).first()
        colors[nodeA].add(color)
        colors[nodeB].add(color)
        println(color)
    }
}