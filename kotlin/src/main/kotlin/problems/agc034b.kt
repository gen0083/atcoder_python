// https://atcoder.jp/contests/agc034/tasks/agc034_b

fun main() {
    agc034b()
}

fun agc034b() {
    val s = readLine()!!
    var i = 0
    var a = 0L
    var count = 0L
    while (i < s.length) {
        while (i < s.length && s[i] == 'A') {
            a++
            i++
        }
        if (i >= s.length) break
        if (i < s.length - 1 && s[i] == 'B' && s[i + 1] == 'C') {
            count += a
            i++
        } else {
            a = 0L
        }
        i++
    }
    println(count)
}