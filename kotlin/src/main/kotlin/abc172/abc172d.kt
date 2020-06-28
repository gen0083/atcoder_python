//

fun main() {
    abc172d()
}

fun abc172d() {
    val n = readLine()!!.toLong()
    var count = 0L
    for (i in 1L..n) {
        count += (i * bun(i))
    }
    println(count)
}

private fun bun(n: Long): Long {
    // 0なら約数は0個、1なら1つ, 2なら2こ（1と2）
    if (n <= 2) return n
    val primes = mutableSetOf<Long>(1L, n)
    var i = 2L
    while (i * i <= n) {
        if (n % i == 0L) {
            primes.add(i)
            primes.add(n / i)
        }
        i++
    }
    return primes.size.toLong()
}