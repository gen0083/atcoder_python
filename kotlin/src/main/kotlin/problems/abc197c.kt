import kotlin.math.max
import kotlin.math.min

fun main(args: Array<String>) {
    abc197c()
}

// 作戦
// nが20件であり、ビットで考えると30ビットしかない
// ということは区切る組み合わせは2^19の区切り方の組み合わせで収まる（524288通り）
// すべての区切り方の組み合わせを求めてそれぞれXORを計算し、最小値を求めれば十分ではないかと考えた
// 愚直すぎるのでもっと簡単な解法があるんだろうな
fun abc197c() {
    val n = readLine()!!.toInt()
    val base = IntArray(30) { 0 }
    base[0] = 1
    var m = base[0]
    val a = List(n) { IntArray(30) { 0 } }
    for ((i, value) in readLine()!!.split(" ").map { it.toInt() }.withIndex()) {
        // 2進数変換（0番目がビット最下位）
        var j = 0
        var k = value
        while (k > 0) {
            if (base[j] == 0) {
                base[j] = base[j - 1] * 2
                m = base[j] * 2
            }
            a[i][j] = k % 2
            k /= 2
            j++
        }
    }
    val result = mutableListOf<IntArray>()
    makePattern(a, IntArray(30) { 0 }, a[0], 1, result)
    for (xor in result) {
        var ans = 0
        for (i in xor.indices) {
            ans += xor[i] * base[i]
        }
        m = min(m, ans)
    }
    println(m)
}

// 1以上の区間に区切ってOR計算を行う部分の全組み合わせを求める
// 最終的に各ビットの1の個数がいくつになるかがわかればXORの結果は求められるので、各桁の1の個数を求める
// 現在の区間のビット OR演算で1が出れば1にするって処理 IntArray
// OR演算を行った各区間の各桁1の個数 IntArray
// 各区間の組み合わせを格納するlist MutableList
// a_1からa_nまでのデータ List<IntArray>
// 現在判定中の位置 Int
//
private fun makePattern(data: List<IntArray>, xor: IntArray, current: IntArray, i: Int, result: MutableList<IntArray>) {
    if (i >= data.size) {
        result.add(xorCalculation(xor, current))
        return
    }
    // 区間を区切らないパターン
    val merge = orCalculation(current, data[i])
    makePattern(data, xor, merge, i + 1, result)
    // 区間を区切るパターン
    val split = xorCalculation(xor, current)
    makePattern(data, split, data[i], i + 1, result)
}

private fun orCalculation(a: IntArray, b: IntArray): IntArray {
    val n = max(a.size, b.size)
    val result = IntArray(n) { 0 }
    for (i in 0 until n) {
        result[i] = if (a[i] == 1 || b[i] == 1) 1 else 0
    }
    return result
}

private fun xorCalculation(a: IntArray, b: IntArray): IntArray {
    val n = max(a.size, b.size)
    val result = IntArray(n) { 0 }
    for (i in 0 until n) {
        result[i] = if ((a[i] + b[i]) % 2 == 1) 1 else 0
    }
    return result
}