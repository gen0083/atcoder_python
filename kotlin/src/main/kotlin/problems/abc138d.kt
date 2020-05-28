import java.util.*

fun main(args: Array<String>) {
    abc138d()
}

fun abc138d() {
    val (n, q) = readLine()!!.split(" ").map { it.toInt() }
    val nodes = Array<MutableList<Int>>(n + 1) { mutableListOf() }
    val parent = IntArray(n + 1) { -1 }
    parent[1] = 0
    val count = IntArray(n + 1) { 0 }
    val operation = IntArray(n + 1) { 0 }
    val pending = ArrayDeque<Pair<Int, Int>>()
    repeat(n - 1) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        if (parent[a] == -1 && parent[b] == -1) {
            // どちらも親ノードが設定されていないデータが先に来る可能性があるので、そういったケースに対応するため
            // 両者が親未設定の場合はキューに積んで後で親子関係の構築を行う
            pending.add(a to b)
        } else {
            // この問題のツリー構造では各ノードは必ず1つの親ノードを持つ
            // つまりaとbのどちらかは必ずまだ親が設定されていないノードである
            // parentが-1は親ノードが未設定のノードなので、この辺設定において親となるのはすでに親ノードが設定されているノード
            val p = if (parent[a] == -1) b else a
            // 親ノードが未設定のノードは、今回の辺設定において子要素となる
            val c = if (parent[a] == -1) a else b
            nodes[p].add(c)
            parent[c] = p
        }
    }
    while (pending.isNotEmpty()) {
        val (a, b) = pending.poll()
        if (parent[a] == -1 && parent[b] == -1) {
            // まだ未設定の可能性はありうる
            pending.add(a to b)
        } else {
            val p = if (parent[a] == -1) b else a
            val c = if (parent[a] == -1) a else b
            nodes[p].add(c)
            parent[c] = p
        }
    }
    repeat(q) {
        val (p, x) = readLine()!!.split(" ").map { it.toInt() }
        operation[p] += x
    }
    val queue = ArrayDeque<Int>()
    queue.add(1)
    while (queue.isNotEmpty()) {
        val c = queue.poll()
        count[c] = count[parent[c]] + operation[c]
        queue.addAll(nodes[c])
    }
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
