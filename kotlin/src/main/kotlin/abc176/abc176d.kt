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
    var wall = ArrayDeque<Pair<Int, Int>>()
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
                val startH = (th - 1).coerceAtLeast(0)
                val endH = (th + 1).coerceAtMost(h - 1)
                val startW = (tw - 1).coerceAtLeast(0)
                val endW = (tw + 1).coerceAtMost(w - 1)
                for (i in startH..endH) {
                    for (j in startW..endW) {
                        if (step[i][j] > -2) continue
                        if (map[i][j] == '.') {
                            if (th == i || tw == j) next.add(i to j)
                        } else {
                            wall.add(i to j)
                        }
                    }
                }
            }
        }
        s++
        while (wall.isNotEmpty()) {
            val (th, tw) = wall.poll()
            if (th !in 0 until h) continue
            if (tw !in 0 until w) continue
            if (step[th][tw] > -2) continue
            if (map[th][tw] == '#') {
                step[th][tw] = -1
                val startH = (th - 2).coerceAtLeast(0)
                val endH = (th + 2).coerceAtMost(h - 1)
                val startW = (tw - 2).coerceAtLeast(0)
                val endW = (tw + 2).coerceAtMost(w - 1)
                for (i in startH..endH) {
                    for (j in startW..endW) {
                        if (map[i][j] == '.' && step[i][j] == -2) next.add(i to j)
                    }
                }
            }
        }
        if (next.isEmpty() && wall.isEmpty()) break
    }
    val ans = step[ch][cw]
    println(if (ans < 0) -1 else ans)
}
