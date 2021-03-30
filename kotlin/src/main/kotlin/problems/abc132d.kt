// https://atcoder.jp/contests/abc132/tasks/abc132_d
// TODO: try to use 逆元

fun main() {
    abc132d()
}

fun abc132d() {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    // 青がk個でこれをiのグループに分ける分け方は二項係数で求まる
    // k-1 C i-1でk個の青をiのグループに分割する場合の組み合わせの数が求まる
    // 赤側の組み合わせは n-k+1 C iで求められる
    // よってk-i C i-1 * n-k+1 C i mod 1_000_000_007が答えになる
    // ただし前提として、そもそも赤の個数がi - 1より小さい場合は答えは0になる
    // (青をi個のグループに分割できない　例：青を3つのグループに分けるには赤が少なくとも2個必要)
    val base = 1_000_000_007L
    val red = n - k
    val com = List(n + 1) { LongArray(n + 1) { 0 } }
    com[0][0] = 1L
    for (i in 1..n) {
        for (j in 0..i) {
            if (j == 0 || j == i) {
                com[i][j] = 1L
            } else {
                com[i][j] = (com[i - 1][j - 1] + com[i - 1][j]) % base
            }
        }
    }
    for (i in 1..k) {
        if (red < i - 1) {
            println(0)
            continue
        }
        println(com[k - 1][i - 1] * com[red + 1][i] % base)
    }
}