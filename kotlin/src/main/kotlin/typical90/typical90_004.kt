fun main() {
    typical90_004()
}

fun typical90_004() {
    val (h, w) = readLine()!!.split(" ").map { it.toInt() }
    val row = IntArray(w) { 0 }
    val column = IntArray(h) { 0 }
    val table = List(h) { IntArray(w) { 0 } }
    repeat(h) { c ->
        for ((r, v) in readLine()!!.split(" ").map { it.toInt() }.withIndex()) {
            row[r] += v
            column[c] += v
            table[c][r] = v
        }
    }
    for (c in 0 until h) {
        println(row.mapIndexed { i, v -> v + column[c] - table[c][i] }.joinToString(" "))
    }
}