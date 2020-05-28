fun main(args: Array<String>) {
    abc138d()
}

fun abc138d() {
    val (n, q) = readLine()!!.split(" ").map { it.toInt() }
    val nodes = Array<MutableList<Int>>(n + 1) { mutableListOf() }
    val count = IntArray(n + 1) { 0 }
    val operation = IntArray(n + 1) { 0 }
    repeat(n - 1) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        nodes[a].add(b)
        nodes[b].add(a)
    }
    repeat(q) {
        val (p, x) = readLine()!!.split(" ").map { it.toInt() }
        operation[p] += x
    }
    val visited = mutableSetOf<Int>()
    traverseTree(1, 0, nodes, operation, count, visited)
    println(count.copyOfRange(1, n + 1).joinToString(" "))
}

private fun traverseTree(currentNode: Int, total: Int, nodes: Array<MutableList<Int>>,
    operation: IntArray, count: IntArray, visited: MutableSet<Int>) {
    val currentValue = total + operation[currentNode]
    count[currentNode] = currentValue
    visited.add(currentNode)
    for (n in nodes[currentNode]) {
        if (n in visited) continue
        traverseTree(n, currentValue, nodes, operation, count, visited)
    }
}
