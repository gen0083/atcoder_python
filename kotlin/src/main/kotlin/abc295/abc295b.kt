//

fun main() {
    abc295b()
}

fun abc295b() {
    val (r, c) = readLine()!!.split(" ").map { it.toInt() }
    val b = Array(r) { Array(c) { '#' } }
    val n = mutableListOf<Triple<Int, Int, Int>>()
    for (i in 0 until r) {
        val s = readLine()!!
        for (j in 0 until c) {
            if (s[j] == '#') continue
            b[i][j] = '.'
            if (s[j] == '.') continue
            val k = s[j].toString().toInt()
            n.add(Triple(k, i, j))
        }
    }
    // この部分のiとかjとか使っているところが、今どこをやってるかを勘違いしやすくバギーなコードだと思った
    for ((v, i, j) in n) {
        val columnFrom = (j - v).coerceAtLeast(0)
        val columnTo = (j + v).coerceAtMost(c - 1)
        var x = if (j - v < 0) v - j else 0
        var switch = false
        for (column in columnFrom..columnTo) {
            val rowFrom = (i - x).coerceAtLeast(0)
            val rowTo = (i + x).coerceAtMost(r - 1)
            if (!switch && x < v) {
                x += 1
            } else {
                x -= 1
                switch = true
            }
            for (row in rowFrom..rowTo) {
                b[row][column] = '.'
            }
        }
    }
    for (s in b) {
        println(s.joinToString(""))
    }
}
