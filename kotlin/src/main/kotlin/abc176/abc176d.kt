import java.util.*

//

fun main() {
    abc176d()
}

fun abc176d() {
    val (h, w) = readLine()!!.split(" ").map { it.toInt() }
    val (ch, cw) = readLine()!!.split(" ").map { it.toInt() - 1 }
    val (dh, dw) = readLine()!!.split(" ").map { it.toInt() - 1 }
    val map = List(h) { CharArray(w) }
    for (i in 0 until h) {
        val s = readLine()!!
        for (j in 0 until w) {
            map[i][j] = s[j]
        }
    }
    val step = List(h) { IntArray(w) { -2 } }
    var visited = ArrayDeque<Pair<Int, Int>>()
    val next = ArrayDeque<Pair<Int, Int>>()
    next.add(dh to dw)
    var s = 0
    while (step[ch][cw] == -2) {
        while (next.isNotEmpty()) {
            val (th, tw) = next.poll()
            if (th !in 0 until h) continue
            if (tw !in 0 until w) continue
            if (step[th][tw] > -2) continue
            if (map[th][tw] == '.') {
                step[th][tw] = s
                visited.add(th to tw)
                next.add(th - 1 to tw)
                next.add(th + 1 to tw)
                next.add(th to tw - 1)
                next.add(th to tw + 1)
            }
        }
        s++
        while (visited.isNotEmpty()) {
            val (th, tw) = visited.poll()
            if (th !in 0 until h) continue
            if (tw !in 0 until w) continue
            val startH = (th - 2).coerceAtLeast(0)
            val endH = (th + 2).coerceAtMost(h - 1)
            val startW = (tw - 2).coerceAtLeast(0)
            val endW = (tw + 2).coerceAtMost(w - 1)
            for (i in startH..endH) {
                for (j in startW..endW) {
                    if (map[i][j] == '.') {
                        if (step[i][j] == -2) next.add(i to j)
                    } else {
                        step[i][j] = -1
                    }
                }
            }
        }
        if (next.isEmpty() && visited.isEmpty()) break
    }
    val ans = step[ch][cw]
    println(if (ans < 0) -1 else ans)
}
