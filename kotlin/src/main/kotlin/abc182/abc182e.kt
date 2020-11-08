//

fun main() {
    abc182e()
}

fun abc182e() {
    val AT_BLOCK = -1
    val NO_LIGHT = 0
    val LIGHTING = 1
    val (h, w, n, m) = readLine()!!.split(" ").map { it.toInt() }
    val lamp = mutableListOf<Pair<Int, Int>>()
    val blocks = List<IntArray>(h + 2) { IntArray(w + 2) { NO_LIGHT } }
    // initialize
    for (i in 0 until h + 2) {
        if (i == 0 || i == h + 1) {
            for (j in 0 until w + 2) {
                blocks[i][j] = AT_BLOCK
            }
        } else {
            blocks[i][0] = AT_BLOCK
            blocks[i][w + 1] = AT_BLOCK
        }
    }
    repeat(n) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        lamp.add(a to b)
    }
    repeat(m) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        blocks[a][b] = AT_BLOCK
    }
    var count = 0L
    //    for (p in lamp) {
    //        val y = p.first
    //        val x = p.second
    //        // to down
    //        for (i in y until h + 2) {
    //            if (blocks[i][x] == AT_BLOCK) break
    //            if (blocks[i][x] == NO_LIGHT) {
    //                blocks[i][x] = LIGHTING
    //                count++
    //            }
    //        }
    //        // to up
    //        for (i in y.downTo(0)) {
    //            if (blocks[i][x] == AT_BLOCK) break
    //            if (blocks[i][x] == NO_LIGHT) {
    //                blocks[i][x] = LIGHTING
    //                count++
    //            }
    //        }
    //        // to right
    //        for (i in x until w + 2) {
    //            if (blocks[y][i] == AT_BLOCK) break
    //            if (blocks[y][i] == NO_LIGHT) {
    //                blocks[y][i] = LIGHTING
    //                count++
    //            }
    //        }
    //        // to left
    //        for (i in x.downTo(0)) {
    //            if (blocks[y][i] == AT_BLOCK) break
    //            if (blocks[y][i] == NO_LIGHT) {
    //                blocks[y][i] = LIGHTING
    //                count++
    //            }
    //        }
    //    }
    lamp.sortBy { it.second }
    for (p in lamp) {
        val y = p.first
        val x = p.second
        for (i in y until h + 2) {
            if (blocks[i][x] != NO_LIGHT) break
            blocks[i][x] = LIGHTING
            count++
        }
        for (i in y.downTo(0)) {
            if (blocks[i][x] != NO_LIGHT) break
            blocks[i][x] = LIGHTING
            count++
        }
    }
    val LIGHT_VERTICAL = 2
    lamp.sortBy { it.first }
    for (p in lamp) {
        val y = p.first
        val x = p.second
        for (i in x until w + 2) {
            if (blocks[y][i] == AT_BLOCK || blocks[i][x] == LIGHT_VERTICAL) break
            if (blocks[y][i] == NO_LIGHT) {
                blocks[y][i] = LIGHT_VERTICAL
                count++
            }
        }
        for (i in x.downTo(0)) {
            if (blocks[y][i] == AT_BLOCK || blocks[i][x] == LIGHT_VERTICAL) break
            if (blocks[y][i] == NO_LIGHT) {
                blocks[y][i] = LIGHT_VERTICAL
                count++
            }
        }
    }
    println(count)
}
