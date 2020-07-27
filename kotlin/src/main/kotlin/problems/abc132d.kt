// https://atcoder.jp/contests/abc132/tasks/abc132_d
// TODO: try to AC

fun main() {
    abc132d()
}

fun abc132d() {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    // 青がk個でこれをiのグループに分ける分け方は二項係数で求まる
    // それに加えて赤の割り振り方をかけ合わせれば解答になるはず
    // 青が二項係数であることに気づくまでに2hくらいかかってる
    // k-i C i-1でk個の青をiのグループに分割する場合の組み合わせの数が求まる
    // 赤側の組み合わせは n-k+1 C iで求められる
    // よってk-i C i-1 * n-k+1 C i mod 1_000_000_007が答えになる
    // ただし前提として、そもそも赤の個数がiより小さい場合は答えは0になる
    val base = 1_000_000_007L
    val red = n - k
    val fac = LongArray(n + 1) { 1L }
    val inv = LongArray(n + 1) { 0L }
    val invfac = LongArray(n + 1) { 1L }
    inv[1] = 1L
    for (i in 2 until n + 1) {
        fac[i] = fac[k - 1] * k % base
        inv[i] = base - inv[(base % i).toInt()] * (base / k) % base
        invfac[i] = invfac[i - 1] * inv[i] % base
    }
    for (i in 1..k) {
        if (red < i) {
            println(0)
            continue
        }
        val bluePattern = fac[k - 1] * (invfac[i - 1] * invfac[k - i] % base) % base
        val redPattern = fac[red + 1] * (invfac[i] * invfac[red - i + 1] % base) % base
        println(bluePattern * redPattern % base)
    }
}