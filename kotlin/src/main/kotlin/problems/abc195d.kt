fun main(args: Array<String>) {
    abc195d()
}

fun abc195d() {
    val (n, m, q) = readLine()!!.split(" ").map { it.toInt() }
    val weights = mutableListOf<Int>()
    val values = mutableListOf<Int>()
    repeat(n) {
        val (w, v) = readLine()!!.split(" ").map { it.toInt() }
        weights.add(w)
        values.add(v)
    }
    val boxes = readLine()!!.split(" ").map { it.toInt() }
    repeat(q) {
        var ans = 0
        val (l, r) = readLine()!!.split(" ").map { it.toInt() }
        val target = mutableListOf<Int>()
        for (i in 0 until m) {
            if (i + 1 in l..r) continue
            target.add(boxes[i])
        }
        target.sort()
        val picked = mutableSetOf<Int>()
        for (w in target) {
            var valuable = 0
            var pick = -1
            for (i in 0 until n) {
                if (i in picked) continue
                if (weights[i] > w) continue
                if (values[i] > valuable) {
                    valuable = values[i]
                    pick = i
                }
            }
            if (pick >= 0) {
                picked.add(pick)
                ans += valuable
            }
        }
        println(ans)
    }
}