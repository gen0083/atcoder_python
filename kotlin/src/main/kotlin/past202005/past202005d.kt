//

fun main() {
    past202005d()
}

fun past202005d() {
    val n = readLine()!!.toInt()
    val number = IntArray(n + 1)
    val bbs = MutableList<String>(5) { " " }
    repeat(5) { bbs[it] = readLine()!! }
    for (j in 1..n) {
        number[j] = detectNumber(bbs, j)
    }
    for (i in 1..n) {
        print(number[i])
    }
    println()
}

fun detectNumber(bbs: List<String>, k: Int): Int {
    val l = 4 * k - 3
    val c = 4 * k - 2
    val r = 4 * k - 1
    if (bbs[1][c] == '#') {
        return 1
    }
    if (bbs[4][c] == '.') {
        // 4 or 7
        if (bbs[0][c] == '.') {
            return 4
        } else {
            return 7
        }
    }
    // 0 2 3 5 6 8 9
    if (bbs[2][c] == '.') {
        return 0
    } else if (bbs[1][r] == '.') {
        // 5 or 6
        if (bbs[3][l] == '.') {
            return 5
        } else {
            return 6
        }
    } else {
        // 2 3 8 9
        return when {
            bbs[1][l] == '#' && bbs[1][r] == '#' && bbs[3][l] == '#' && bbs[3][r] == '#' -> 8
            bbs[1][l] == '#'                                                             -> 9
            bbs[3][l] == '#'                                                             -> 2
            else                                                                         -> 3
        }
    }
}