import kotlin.math.max
import kotlin.math.min

fun main() {
    abc145d()
}

fun abc145d() {
    val (x, y) = readLine()!!.split(" ").map { it.toInt() }
    if (x == y && x % 3 != 0) {
        // xとyが同じ値の場合、3の倍数でないと到達不可能
        // 2,2とか8,8とか
        println(0)
        return
    }
    // パスカルの三角形で考えれば答えは出るが、すべての組み合わせを求めていくと時間内におさまらないと思われる
    val small = min(x, y)
    val big = max(x, y)
    if (small * 2 == big) {
        // x,yの座標の小さい方の2倍＝大きい方ならその移動パターンは1しかない（1,2移動を選び続けるor2,1を選び続けるしかないので）
        println(1)
        return
    }
    if (small * 2 <= big) {
        // xとyの関係はお互いの2倍までの範囲内が限度なので、それを超えた盤面ではXYに到達不可能
        println(0)
        return
    }
    // 3の倍数のマスを基準に探していけば早い気がする
    var one = (x + y) / 3
    var two = 0
    var found = false
    while (!found && one > 0) {
        if ((one + two * 2 == small && one * 2 + two == big) ||
            (one + two * 2 == big && one * 2 + two == small)) {
            found = true
            break
        }
        two++
        one--
    }
    if (found) {
        val depth = one + two
        val memo = mutableMapOf<Pair<Int, Int>, Int>()
        val pattern = triangle(depth, two, memo)
        println(pattern % 1_000_000_007)
    } else {
        // 到達できない
        println(0)
    }
}

private fun triangle(i: Int, j: Int, memo: MutableMap<Pair<Int, Int>, Int>): Int {
    //    if (i == j) return 1
    //    if (i == 0 || j == 0) return 1
    //    if (j == 1 || j + 1 == i) return i
    //    if (i to j in memo) {
    //        return memo.getOrDefault(i to j, 1)
    //    }
    //    val one = triangle(i -1, j -1, memo)
    //    val two = triangle(i - 1, j, memo)
    //    memo[i to j] = one + two
    //    return one + two
    val base_num = 1_000_000_007
    val max_num = i + 1
    // facはn!を計算してる(だたしmod 1_000_000_007をとったものだけども)
    val fac = LongArray(max_num) { 1L }
    // invは逆元を計算してる
    val inv = LongArray(max_num) { 0L }
    // finvは逆元の階乗を計算してる、つまりnCrを計算するさいにn!/r!(n-r)!を計算するが、
    // このときの分母となる1/r!の部分を逆元の階乗として計算してる
    val finv = LongArray(max_num) { 1L }
    inv[1] = 1L
    for (k in 2 until max_num) {
        fac[k] = fac[k - 1] * k % base_num
        inv[k] = base_num - inv[base_num % k] * (base_num / k) % base_num
        finv[k] = finv[k - 1] * inv[k] % base_num
    }
    val ans = fac[i] * (finv[j] * finv[i - j] % base_num) % base_num
    return ans.toInt()
}
