import java.lang.Integer.max

// https://atcoder.jp/contests/agc047/tasks/agc047_a
// TODO: try to AC

fun main() {
    agc047a()
}

fun agc047a() {
    val n = readLine()!!.toInt()
    val p = mutableListOf<Long>()
    val plusJou = listOf(2, 4, 8, 16, 32, 64, 128, 256, 512)
    val minusJou =
        listOf("5", "25", "125", "0625", "03125", "015625", "0078125", "00390625", "001953125")
    val pair = List(2) { IntArray(9) { 0 } }
    val reg = "[0-9]+\\.[0-9]+".toRegex()
    val notOnlyZero = ".*[1-9]+.*".toRegex()
    var syouCount = 0
    repeat(n) {
        val s = readLine()!!
        if (s.matches(reg)) {
            // 小数点含む（ただし小数点以下すべて0の場合は整数として扱うこと）
            val i = s.indexOf('.')
            val syou = s.substring(i + 1)
            if (syou.matches(notOnlyZero)) {
                for ((j, v) in minusJou.withIndex()) {
                    if (v == syou) pair[1][j]++
                }
            } else {
                // 正規化したら整数
                val a = s.substring(0, i).toLong()
                syouCount++
                if (a % 2 == 0L) {
                    for ((j, v) in plusJou.withIndex()) {
                        if (a % v == 0L) {
                            pair[0][j]++
                        }
                    }
                }
            }
        } else {
            val l = s.toLong()
            syouCount++
            if (l % 2 == 0L) {
                for ((j, v) in plusJou.withIndex()) {
                    if (l % v == 0L) {
                        pair[0][j]++
                    }
                }
            }
        }
    }
    var count = syouCount * (syouCount + 1) / 2
    for (i in 0 until 9) {
        count += max(pair[0][i], pair[1][i])
    }
    println(count)
}