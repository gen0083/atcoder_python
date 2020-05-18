fun main(args: Array<String>) {
    agc017a()
}

fun agc017a() {
    val (n, p) = readLine()!!.split(" ").map { it.toInt() }
    //    val a = readLine()!!.split(" ").map { it.toInt() % 2 }
    //    val counts = mutableMapOf(0 to 0, 1 to 0)
    //    generatePattern(0, 0, a, counts)
    //    println(counts[p])
    var evenCount = 0
    var oddCount = 0
    readLine()!!.split(" ")
        .stream()
        .map { it.toInt() % 2 }
        .forEach {
            if (it == 0) {
                evenCount++
            } else {
                oddCount++
            }
        }
    var oddP = 0L
    val oddPBase = factorial(oddCount)
    for (i in 2 - p..oddCount step 2) {
        val f = factorial(i)
        oddP += oddPBase / f
    }
    val evenP = factorial(evenCount)
    val ans = if (p == 0) {
        oddP + oddP * evenP + evenP
    } else {
        oddP + oddP * evenP
    }
    println(ans)
}

private var memo: LongArray = LongArray(51) { 0L }.apply { set(1, 1L) }

private fun factorial(n: Int): Long {
    if (n == 0) return 0
    if (memo[n] != 0L) return memo[n]
    val p = factorial(n - 1)
    val f = p * n
    memo[n] = f
    return f
}

// これでやると組み合わせが2^50で10＾15くらいの計算量になる
// したがってこれでは入力例4もクリアできない
private fun generatePattern(index: Int, total: Int, array: List<Int>,
    counts: MutableMap<Int, Int>) {
    if (index == array.size) {
        counts[total % 2] = counts[total % 2]!! + 1
        return
    }
    generatePattern(index + 1, total, array, counts)
    val current = array[index] + total
    generatePattern(index + 1, current, array, counts)
}