// TODO: try to AC

fun main() {
    abc125c()
}

fun abc125c() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    val maxA = a.max()!!
    val table = IntArray(maxA + 1)
    table[1] = 1
    for (i in 2..maxA) {
        var j = 1
        while (i * j <= maxA) {
            table[i * j] = i
            j++
        }
    }
    val common = mutableListOf<Int>()
    val semiCommon = mutableListOf<Int>()
    for (i in a) {
        val primes = mutableListOf<Int>()
        // エラトステネスの篩を使った素因数分解
        var t = i
        var j = table[t]
        while (t != j) {
            primes.add(j)
            t /= j
            j = table[t]
        }
        // 共通する素数をcommonに、1つ足りないものをsemiCommonに保持していく
        // ここの集計の仕方がこの問題の味噌だと思う
        // おなじ2でも、ものによっては複数出現するわけで、それを4とかでひとくくりにしてしまうと、
        // 次の数で2しかないときにややこしい
        // なにがややこしいって、4ならまだしもこれが128で共通してたのに、次の数では4しかなかった、というときに
        // 128から4にするのがすぐに判定できるのかってこと
    }
}