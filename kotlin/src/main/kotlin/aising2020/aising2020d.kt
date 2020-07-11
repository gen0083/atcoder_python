// https://atcoder.jp/contests/aising2020/tasks/aising2020_d
// TODO: try to AC

fun main() {
    aising2020d()
}

fun aising2020d() {
    val n = readLine()!!.toInt()
    val x = readLine()!!.toMutableList()
    var bitcount = x.count { it == '1' }.toLong()
    for (i in 0 until n) {
        if (x[i] == '1') {
            x[i] = '0'
            println(func(x.joinToString(""), bitcount - 1))
            x[i] = '1'
        } else {
            x[i] = '1'
            println(func(x.joinToString(""), bitcount + 1))
            x[i] = '0'
        }
    }
}

private fun func(x: String, bitcount: Long): Int {
    // 2*10^5の2進数文字列を変換することはできない（NumberFormatException）
    // 上からビットカウントの2進数表記の文字列を消していけば答えが出るかなと思ったけど、コードに落とし込めない
    var count = 0
    var t = convertNumber(x)
    var p = bitcount
    while (t > 1) {
        t = t % p
        p = popcount(t)
        count++
    }
    return count
}

private fun convertNumber(digitString: String): Long {
    var l = 0L
    var fac = 1L
    for (i in digitString.lastIndex downTo 0) {
        if (digitString[i] == '1') {
            l += fac
        }
        fac *= 2L
    }
    return l
}

private fun popcount(n: Long): Long {
    var count = 0L
    var t = n
    while (t > 1L) {
        count += t % 2
        t /= 2L
    }
    if (t == 1L) {
        count += 1
    }
    return count
}