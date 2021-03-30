fun main(args: Array<String>) {
    agc017a()
}

fun agc017a() {
    val (n, p) = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toInt() % 2 }
    //    val counts = mutableMapOf(0 to 0, 1 to 0)
    //    generatePattern(0, 0, a, counts)
    //    println(counts[p])
    var evenCount = 0
    var oddCount = 0
    //    readLine()!!.split(" ")
    //        .stream()
    //        .map { it.toInt() % 2 }
    //        .forEach {
    //            if (it == 0) {
    //                evenCount++
    //            } else {
    //                oddCount++
    //            }
    //        }
    oddCount = a.count { it == 1 }
    // なぜそうなるのか理屈がわからない
    // 奇数が含まれる場合なら、偶数だろうと奇数だろうと2^n-1になるのはなぜ？
    // 奇数があるならその奇数を選ぶパターンがP=0/1のどちらの場合も1パターン減るからということ？
    val ans = if (oddCount == 0) {
        if (p == 0) {
            Math.pow(2.0, n.toDouble()).toLong()
        } else {
            0
        }
    } else {
        Math.pow(2.0, n - 1.0).toLong()
    }
    println(ans)
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