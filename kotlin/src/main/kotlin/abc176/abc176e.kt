//

fun main() {
    abc176e()
}

fun abc176e() {
    val (h, w, m) = readLine()!!.split(" ").map { it.toInt() }
    val bom = mutableMapOf<Int, MutableSet<Int>>()
    val countH = IntArray(h + 1) { 0 }
    val countW = IntArray(w + 1) { 0 }
    var maxH = 0
    val maxHIndices = mutableSetOf<Int>()
    var maxW = 0
    val maxWIndices = mutableSetOf<Int>()
    repeat(m) {
        val (ih, iw) = readLine()!!.split(" ").map { it.toInt() }
        if (ih in bom) {
            bom[ih]!!.add(iw)
        } else {
            bom[ih] = mutableSetOf(iw)
        }
        countH[ih]++
        if (countH[ih] > maxH) {
            maxH = countH[ih]
            maxHIndices.clear()
            maxHIndices.add(ih)
        } else if (countH[ih] == maxH) {
            maxHIndices.add(ih)
        }
        countW[iw]++
        if (countW[iw] > maxW) {
            maxW = countW[iw]
            maxWIndices.clear()
            maxWIndices.add(iw)
        } else if (countW[iw] == maxW) {
            maxWIndices.add(iw)
        }
    }
    for (th in maxHIndices) {
        for (tw in maxWIndices) {
            if (bom[th]?.contains(tw)?.not() ?: false) {
                println(maxH + maxW)
                return
            }
        }
    }
    println(maxH + maxW - 1)
}
