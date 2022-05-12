// https://atcoder.jp/contests/abc170/tasks/abc170_d

fun main() {
    abc170d()
}

fun abc170d() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    val sorted = a.sorted()
    val max = a.maxOrNull()!!
    val primes = BooleanArray(max + 1) { false }
    for (i in sorted) {
        if (primes[i]) continue
        var j = 2
        while (i * j <= max) {
            primes[i * j] = true
            j++
        }
    }
    val orig = mutableSetOf<Int>()
    val dup = mutableSetOf<Int>()
    for (i in sorted) {
        if (i in orig) dup.add(i)
        if (!primes[i]) orig.add(i)
    }
    println(orig.count() - dup.count())
}
