import java.lang.Math.pow

//

fun main() {
    abc173c()
}

fun abc173c() {
    val (h, w, k) = readLine()!!.split(" ").map { it.toInt() }
    val row = IntArray(h) { 0 }
    val column = IntArray(w) { 0 }
    val table = List(h) { CharArray(w) }
    var total = 0
    for (i in 0 until h) {
        var rowCount = 0
        val s = readLine()!!
        for (j in 0 until w) {
            if (s[j] == '#') {
                rowCount++
                column[j]++
                total++
            }
            table[i][j] = s[j]
        }
        row[i] = rowCount
    }
    val rowBit = IntArray(h) { i -> (1 shl i) }
    val colBit = IntArray(w) { i -> (1 shl (h + i)) }
    val pattern = ((pow(2.0, h.toDouble())) * (pow(2.0, w.toDouble()))).toInt()
    var count = 0
    for (i in 0 until pattern) {
        var blacks = 0
        val selectedRow = mutableListOf<Int>()
        val selectedCol = mutableListOf<Int>()
        for ((index, r) in rowBit.withIndex()) {
            if (i and r == r) {
                selectedRow.add(index)
                blacks += row[index]
            }
        }
        for ((index, c) in colBit.withIndex()) {
            if (i and c == c) {
                selectedCol.add(index)
                blacks += column[index]
            }
        }
        if (selectedRow.size == 0 || selectedCol.size == 0) {
        } else {
            for (r in selectedRow) {
                for (c in selectedCol) {
                    if (table[r][c] == '#') blacks--
                }
            }
        }
        if (total - blacks == k) count++
    }
    println(count)
}
