// https://atcoder.jp/contests/abc170/tasks/abc170_d

fun main() {
    abc170d()
}

fun abc170d() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    val sorted = a.sorted()
    var i = 0
    val primes = mutableSetOf<Int>()
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
    val sameNum = mutableSetOf<Int>()
    while (i < n) {
        val t = sorted[i]
        if (t in primes) {
            // 消してしまったらダメ
            sameNum.add(t)
        } else {
            // prime check
            var isPrime = true
            for (e in primes) {
                if (t % e == 0) {
                    isPrime = false
                    break
                }
                // 素数をしらべるならルートまででいいが、この問題に置いてはそれでは足りない
                // たとえば16の場合、2乗して16になるのは4だが、4がなくとも8がある場合に16は他の数で割り切れる数になる
                // さりとて2倍で処理すると計算量的に間に合わないので難しい
                if (e * 2 > t) break
            }
            if (isPrime) primes.add(t)
        }
        i++
    }
    println(primes.count() - sameNum.count())
}
