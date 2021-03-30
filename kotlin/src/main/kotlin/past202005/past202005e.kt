//

fun main() {
    past202005e()
}

fun past202005e() {
    val (n, m, q) = readLine()!!.split(" ").map { it.toInt() }
    val neigbor = Array<MutableSet<Int>>(n + 1) { mutableSetOf() }
    repeat(m) {
        val (u, v) = readLine()!!.split(" ").map { it.toInt() }
        neigbor[u].add(v)
        neigbor[v].add(u)
    }
    val color = IntArray(n + 1) { 0 }
    readLine()!!.split(" ").map { it.toInt() }.forEachIndexed { index, v ->
        color[index + 1] = v
    }
    repeat(q) {
        val query = readLine()!!.split(" ")
        val target = query[1].toInt()
        println(color[target])
        if (query[0] == "1") {
            // 隣接するスプリンクラーの色を変更
            val c = color[target]
            for (t in neigbor[target]) {
                color[t] = c
            }
        } else {
            // スプリンクラーの色をyに変更
            val y = query[2].toInt()
            color[target] = y
        }
    }
}
