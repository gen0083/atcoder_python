//

fun main() {
    abc170d()
}

fun abc170d() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    val sorted = a.sorted()
    var i = 0
    var count = 0
    val others = mutableSetOf<Int>()
    if (sorted[i] == 1) {
        // 1が存在する場合、1が単独なら1つだけ、複数あるなら0
        // 他のあらゆる数は1で割り切れるから
        if (sorted[i + 1] == 1) {
            println(0)
        } else {
            println(1)
        }
        return
    }
    while (i < n) {
        if (i < n - 1 && sorted[i] == sorted[i + 1]) {
            val t = sorted[i]
            others.add(t)
            i++
            while (i < n && sorted[i] == t) {
                i++
            }
            continue
        }
        var j = 2
        var isOrigin = true
        while (j + j <= sorted[i]) {
            if (sorted[i] % j == 0) {
                if (j in others) {
                    isOrigin = false
                    break
                }
                if (sorted[i] / j in others) {
                    isOrigin = false
                    break
                }
            }
            j++
        }
        if (isOrigin) count++
        others.add(sorted[i])
        i++
    }
    println(count)
}
