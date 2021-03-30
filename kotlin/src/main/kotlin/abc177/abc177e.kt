//

fun main() {
    abc177e()
}

fun abc177e() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    val gcds = mutableMapOf<Int, Int>()
    var max = a.max()!!
    val table = IntArray(max + 1)
    table[1] = 1
    for (i in 2..max) {
        if (table[i] != 0) continue
        var j = 1
        while (i * j <= max) {
            if (table[i * j] == 0) {
                table[i * j] = i
            }
            j++
        }
    }
    for (i in a) {
        var t = i
        var j = table[t]
        while (t != j) {
            val p = j
            while (j == p) {
                t /= j
                j = table[t]
            }
            gcds[p] = gcds.getOrDefault(p, 0) + 1
        }
        gcds[t] = gcds.getOrDefault(t, 0) + 1
    }
    // 1が存在するならnot coprimeにはならない
    if (a.contains(1)) {
        if (gcds.filter { it.value > 1 }.isNotEmpty()) {
            println("setwise coprime")
        } else {
            println("pairwise coprime")
        }
    } else {
        val maxCount = gcds.maxBy { it.value }!!
        if (maxCount.value == 1) {
            println("pairwise coprime")
        } else if (maxCount.value == a.size) {
            println("not coprime")
        } else {
            println("setwise coprime")
        }
    }
}
