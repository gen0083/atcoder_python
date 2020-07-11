// https://atcoder.jp/contests/agc032/tasks/agc032_a
// 解説見たらたったこれだけのことか・・・という感じ
// 操作の逆順から考える、という思考はなかったので新しい視座を得られた、とするか・・・

fun main() {
    agc032a()
}

fun agc032a() {
    val n = readLine()!!.toInt()
    val b = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
    if (isImpossible(b)) {
        println(-1)
        return
    }
    var ans = mutableListOf<Int>()
    while (b.isNotEmpty()) {
        var j = b.lastIndex
        while (j >= 0) {
            if (b[j] == j + 1) {
                ans.add(b[j])
                b.removeAt(j)
                break
            }
            j--
        }
    }
    ans.reverse()
    println(ans.joinToString("\n"))
}

private fun isImpossible(values: List<Int>): Boolean {
    for (i in values.indices) {
        if (values[i] > i + 1) return true
    }
    return false
}