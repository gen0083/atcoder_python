import kotlin.math.max

fun main() {
    abc129d()
}

fun abc129d() {
    val (h, w) = readLine()!!.split(" ").map { it.toInt() }
    val vertical = List<IntArray>(h) { IntArray(w + 1) { 0 } }
    val horizontal = List<IntArray>(h) { IntArray(w + 1) { 0 } }
    val vCount = IntArray(w + 1) { 0 }
    repeat(h) { height ->
        val s = readLine()!! + "#"
        // 番兵を用意すれば右端が.であってもカウントを正しく記録できるようにする
        var i = 0
        while (i <= w) {
            var t = 0
            var start = i
            while (s[i] == '.') {
                i++
                t++
            }
            for (j in start until i) {
                vertical[height][j] = t
                vCount[j]++
            }
            vertical[height][i] = 0
            for (k in (height - vCount[i]) until height) {
                horizontal[k][i] = vCount[i]
            }
            vCount[i] = 0
            horizontal[height][i] = 0
            i++
        }
    }
    for (i in 0 until w) {
        if (vCount[i] == 0) continue
        for (k in (h - vCount[i]) until h) {
            horizontal[k][i] = vCount[i]
        }
    }
    var max_size = 0
    for (i in 0 until h) {
        for (j in 0 until w) {
            max_size = max(vertical[i][j] + horizontal[i][j] - 1, max_size)
        }
    }
    println(max_size)
}