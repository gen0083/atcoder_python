import kotlin.math.max
import kotlin.math.min

fun main() {
    abc304d()
}

fun abc304d() {
    val (w, h) = readLine()!!.split(" ").map { it.toInt() }
    val n = readLine()!!.toInt()
    val cake = mutableListOf<Pair<Int, Int>>()
    repeat(n) {
        val (x, y) = readLine()!!.split(" ").map { it.toInt() - 1 }
        cake.add(x to y)
    }
    val aSize = readLine()!!.toInt()
    val x = IntArray(w) { 0 }
    val a = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
    a.add(0)
    var j = 0
    for (i in 0 until w) {
        if (i == a[j]) {
            j += 1
        }
        x[i] = j
    }
    val bSize = readLine()!!.toInt()
    val y = IntArray(h) { 0 }
    val b = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
    b.add(0)
    j = 0
    for (i in 0 until h) {
        if (i == b[j]) {
            j++
        }
        y[i] = j
    }
    var minAns = n
    var maxAns = 0
    val piece = List(bSize + 1) { IntArray(aSize + 1) { 0 } }
    val check = mutableSetOf<Pair<Int, Int>>()
    for ((px, py) in cake) {
        val xx = x[px]
        val yy = y[py]
        piece[yy][xx] += 1
        maxAns = max(maxAns, piece[yy][xx])
        check.add(xx to yy)
    }
    if (check.size == (aSize + 1) * (bSize + 1)) {
        for ((px, py) in check) {
            minAns = min(minAns, piece[py][px])
        }
    } else {
        minAns = 0
    }
    println("$minAns $maxAns")
}