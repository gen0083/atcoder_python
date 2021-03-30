import java.lang.Math.min

//

fun main() {
    nomura2020c()
}

fun nomura2020c() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toLong() }
    // 深さnでちょうど終わらないとダメ
    // つまり最終のnの葉の数から逆算して二分木を構築しないとダメ
    //    var total = 0L
    //    var nodes = 1L
    //    for (d in 0..n) {
    //        if (a[d] <= nodes) {
    //            total += nodes
    //        } else {
    //            println(-1)
    //            return
    //        }
    //        nodes = (nodes - a[d]) * 2
    //    }
    //    println(total)
    if (n > 0 && a[0] > 0) {
        // ルートが葉でありうるのはn=0のときだけ
        println(-1)
        return
    }
    var total = 0L
    var nodes = 1L
    var nodesLimit = 1L
    val limit = LongArray(n + 1) { 0L }
    for (d in 0..n) {
        // 上から順に子を持てるノード数をlimitに格納していく
        // と同時にleafノード数を含めてそのdepthにおける最大ノード数の範囲内でおさめられるかを計算する
        // limitは最大値であって、最終的にdepth=nのリーフノード数に収束する必要があるので、それがノード数と一致するとは限らない
        if (a[d] > nodesLimit) {
            println(-1)
            return
        }
        nodesLimit -= a[d]
        limit[d] = nodesLimit
        nodesLimit = nodesLimit * 2
        // リーフノード数はノード数のカウントにおいて確定した数値なので、予め足し込んでおく
        total += a[d]
    }
    nodes = a[n]
    for (d in n downTo 1) {
        // 直前のノード数が限界いっぱいの場合、そもそもすべてのノードが枝でないと二分木を構築できないのでそのチェック
        //        if (nodes > limit[d]) {
        //            println(-1)
        //            return
        //        }
        total += nodes
        nodes = min(limit[d - 1], nodes)
    }
    println(total - 1)
    //    val nodesCount = mutableListOf<Long>()
    //    dfs(nodesCount, a, 0, n, 1L, 1L, 0L)
    //    println(nodesCount.max() ?: -1)
}

private fun dfs(nodesCount: MutableList<Long>, leafCount: List<Long>, depth: Int, n: Int,
    nodesLimit: Long, currentNode: Long, total: Long) {
    if (depth == n) {
        if (currentNode == leafCount[depth]) {
            nodesCount.add(total + leafCount[n])
        }
        return
    }
    if (currentNode + leafCount[depth] > nodesLimit) return
    val nextLimit = (nodesLimit - leafCount[depth]) * 2
    val nextTotal = total + currentNode + leafCount[depth]
    dfs(nodesCount, leafCount, depth + 1, n, nextLimit, currentNode * 2, nextTotal)
    dfs(nodesCount, leafCount, depth + 1, n, nextLimit, currentNode, nextTotal)
}