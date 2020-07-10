// https://atcoder.jp/contests/caddi2018/tasks/caddi2018_a

fun main() {
    caddi2018a()
}

fun caddi2018a() {
    val (n, p) = readLine()!!.split(" ").map { it.toLong() }
    if (n == 1L) {
        println(p)
        return
    }
    if (p == 1L) {
        println(1)
        return
    }
    // 素因数分解
    val primes = mutableMapOf<Long, Int>()
    var t = p
    var i = 2L
    while (i * i <= t) {
        var count = 0
        while (t % i == 0L) {
            t /= i
            count++
        }
        primes[i] = count
        i++
    }
    if (t != 1L) primes[t] = 1
    var gcd = 1L
    for ((prime, count) in primes.filterValues { it >= n }) {
        val factor = count / n
        repeat(factor.toInt()) {
            gcd *= prime
        }
    }
    println(gcd)
}