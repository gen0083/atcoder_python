fun main(args: Array<String>) {
    abc142d()
}

fun abc142d() {
    val (a, b) = readLine()!!.split(" ").map { it.toLong() }
    val gcd = gcd(a, b)
    val primes = mutableSetOf<Long>()
    isPrimeCommonDivider(2L, primes, a, b)
    for (l in 3L..Math.sqrt(gcd.toDouble()).toLong() + 1 step 2) {
        isPrimeCommonDivider(l, primes, a, b)
    }
    primes.add(1L)
    println(primes.count())
}

fun gcd(a: Long, b: Long): Long {
    //    var source = max(a, b)
    //    var div = min(a, b)
    var source = if (a > b) a else b
    var div = if (b <= a) b else a
    var r = source % div
    while (r != 0L) {
        source = div
        div = r
        r = source % div
    }
    return div
}

fun isPrimeCommonDivider(n: Long, primes: MutableSet<Long>, a: Long, b: Long): Boolean {
    if (a % n == 0L && b % n == 0L) {
        if (a in primes) return false
        for (p in primes) {
            if (n % p == 0L) return false
        }
        primes.add(n)
        return true
    } else {
        return false
    }
}