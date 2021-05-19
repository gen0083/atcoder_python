fun main(args: Array<String>) {
    abc201c()
}

fun abc201c() {
    val s = readLine()!!
    refine(s)
}

private fun refine(s: String) {
    val x_count = s.count { it == 'x' }
    val o_count = s.count { it == 'o' }
    var count = quadruple(10 - x_count)
    when (o_count) {
        0 -> Unit
        1 -> {
            count -= quadruple(9 - x_count)
        }
        2 -> {
            count -= 2 * quadruple(9 - x_count)
            count += quadruple(8 - x_count)
        }
        3 -> {
            count -= 3 * quadruple(9 - x_count)
            count += 3 * quadruple(8 - x_count)
            count -= quadruple(7 - x_count)
        }
        4 -> count = 24
        else -> count = 0
    }
    println(count)
}

private fun quadruple(i: Int) = i * i * i * i

private fun donyoku(s: String) {
    // 最大でも10^5回ですむので5重ループで愚直にチェックするのでも解ける
    var count = 0
    for (i in 0..9) {
        for (j in 0..9) {
            for (k in 0..9) {
                for (l in 0..9) {
                    var satisfy = true
                    for (x in 0..9) {
                        if (s[x] == '?') continue
                        if (s[x] == 'x') {
                            if (i == x || j == x || k == x || l == x) {
                                satisfy = false
                                break
                            }
                        } else {
                            if (i != x && j != x && k != x && l != x) {
                                satisfy = false
                                break
                            }
                        }
                    }
                    if (satisfy) count++
                }
            }
        }
    }
    println(count)
}