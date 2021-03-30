import kotlin.math.max

//

fun main() {
    abc124d()
}

fun abc124d() {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    val s = readLine()!!
    val table = List(2) { IntArray(n + 1) { 0 } }
    val startZero = s[0] == '0'
    var z = 0
    var o = 0
    var performZero = startZero
    for (c in s) {
        if (c == '0') {
            if (!performZero) {
                // 連続する1が途切れたので1のindexをすすめる
                performZero = true
                o++
            }
            table[0][z]++
        } else {
            if (performZero) {
                // 連続する0が途切れたので、ゼロのindexをすすめる
                performZero = false
                z++
            }
            table[1][o]++
        }
    }
    var count = 0
    for (i in 0 until k) {
        count += table[0][i] + table[1][i]
        if (table[0][i] == 0 && table[1][i] == 0) break
    }
    if (!startZero) {
        count += table[1][k]
    }
    var maxCount = count
    for (i in k until n - k) {
        if (table[0][i] == 0 && table[1][i] == 0) break
        count -= table[0][i - k]
        count -= if (startZero) {
            if (i - k - 1 >= 0) table[1][i - k - 1] else 0
        } else {
            table[1][i - k]
        }
        count += table[0][i]
        count += if (startZero) table[1][i] else table[1][i + 1]
        maxCount = max(count, maxCount)
    }
    println(maxCount)
}