// https://atcoder.jp/contests/abc134/tasks/abc134_d

fun main() {
    abc134d()
}

fun abc134d() {
    val n = readLine()!!.toInt()
    // 各桁について、1ならiの倍数が奇数個になるようにするという意味
    val a = BooleanArray(n + 1) { false }
    for ((i, s) in readLine()!!.split(" ").withIndex()) {
        a[i + 1] = s == "1"
    }
    val ans = mutableSetOf<Int>()
    var i = n
    while (i * 2 > n) {
        if (a[i]) ans.add(i)
        i--
    }
    while (i > 1) {
        var k = 2
        var count = 0
        while (i * k <= n) {
            if (i * k in ans) count++
            k++
        }
        val isOdd = count % 2 == 1
        if (isOdd xor a[i]) ans.add(i)
        i--
    }
    if (a[1]) {
        if (ans.size % 2 == 0) ans.add(1)
    } else {
        if (ans.size % 2 == 1) ans.add(1)
    }
    println(ans.size)
    println(ans.joinToString(" "))
}