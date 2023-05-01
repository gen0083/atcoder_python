//

fun main() {
    abc295d()
}

private class Numbers {
    private val count = Array<Int>(10) { 0 }
    private var size = 0

    fun add(n: Int) {
        size++
        count[n]++
    }

    fun isUresii() {
    }
}

fun abc295d() {
    val s = readLine()!!.map { it.toString().toInt() }
    val n = s.size
    val a = Array(10) { 0 }
    var u = 0
    for (i in 0 until n) {
        val current = s[i]
        a[current] += 1
        val start = if ((i + 1) % 2 == 0) 0 else 1
        if (start == 0 && a.none { it % 2 == 1 }) u += 1
        val tmp = a.clone()
        for (j in start..i - 2 step 2) {
            val prev = s[j]
            val prev2 = s[j + 1]
            tmp[prev] -= 1
            tmp[prev2] -= 1
            if (tmp.none { it % 2 == 1 }) u += 1
        }
    }
    println(u)
}
