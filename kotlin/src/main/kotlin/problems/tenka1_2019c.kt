import kotlin.math.min

fun main() {
    tenka1_2019c()
}

fun tenka1_2019c() {
    val n = readLine()!!.toInt()
    val s = readLine()!!
    if (!s.contains('#') || !s.contains('.')) {
        println(0)
        return
    }
    // 最初に黒が出現するまでの.と、.が最後に出現して以降の#に関しては触る必要がない
    // ただしこの考え方では、変換範囲の最初の部分を白に、最後の部分を黒に変換するケースが最小の場合に対応できてない
    var rw = s.count { it == '.' }
    var count = rw
    var lb = 0
    for (i in 0 until n) {
        if (s[i] == '.') {
            rw--
        } else {
            lb++
        }
        count = min(count, rw + lb)
    }
    println(count)
}