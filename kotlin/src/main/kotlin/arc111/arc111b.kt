//

fun main() {
    arc111b()
}

fun arc111b() {
    val n = readLine()!!.toInt()
    val table = IntArray(400001) { 0 }
    val cardsA = IntArray(n) { 0 }
    val cardsB = IntArray(n) { 0 }
    repeat(n) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        table[a]++
        table[b]++
        cardsA[it] = a
        cardsB[it] = b
    }
    var count = 0
    var unique = 0
    for (i in 0 until n) {
        val a = cardsA[i]
        val b = cardsB[i]
        if (table[a] == 1 && table[b] == 1) {
            unique++
        }
    }
    for (i in 1..400000) {
        if (table[i] >= 1) count++
    }
    println((count - unique).coerceAtMost(n))
}
