//

fun main() {
    abc174c()
}

fun abc174c() {
    // 普通に筆算すればよかっただけか・・・
    val n = readLine()!!
    val ni = n.toInt()
    var count = 0
    val baseE = "7".repeat(n.length)
    val baseP = "7".repeat(n.length + 1)
    val base = if (baseE.toInt() >= ni) {
        count = n.length
        baseE.toInt()
    } else {
        count = n.length + 1
        baseP.toInt()
    }
    var next = 0
    val remain = mutableSetOf<Int>()
    var t = base
    while (t % ni != 0) {
        count++
        next = t % ni
        t = next * 10 + 7
        if (next == 0) {
            break
        }
        if (next in remain) {
            // ループする可能性もあるので、同じあまりが出現したらそれは実現不可能ということ
            println(-1)
            return
        } else {
            remain.add(next)
        }
    }
    println(count)
}

private fun listUpDivider(n: Int): List<Int> {
    var i = 1
    val list = mutableListOf<Int>()
    while (i * i <= n) {
        if (n % i == 0) {
            list.add(i)
            list.add(n / i)
        }
        i++
    }
    return list
}