// https://atcoder.jp/contests/m-solutions2020/tasks/m_solutions2020_d
// TODO: try to AC
// DP使ってやればできそうなんだけど、相変わらず更新のイメージがうまくもてない
// 変数が多すぎて頭がこんがらがってる

fun main() {
    msolutions2020d()
}

fun msolutions2020d() {
    val n = readLine()!!.toInt()
    val kabuka = readLine()!!.split(" ").map { it.toInt() }
    val cash = IntArray(n + 1) { 0 }
    val kabu = IntArray(n + 1) { 0 }
    val total = IntArray(n + 1) { 0 }
    cash[0] = 1000
    total[0] = 1000
    cash[1] = cash[0]
    total[1] = total[0]
    for (i in 0 until n) {
        val buy = cash[i + 1] / kabuka[i]
        val price = kabuka[i] * buy
        val remain = cash[i + 1] - kabuka[i] * buy
        if (total[i] > price + remain) {
            kabu[i + 1] = kabu[i]
            cash[i + 1] = cash[i]
            total[i + 1] = total[i]
        } else {
            kabu[i + 1] = buy
            cash[i + 1] = remain
            total[i + 1] = price + remain
        }
        for (j in i + 1 until n) {
            if (buy * kabuka[j] + remain > total[i + 1]) {
                kabu[j + 1] = 0
                cash[j + 1] = buy * kabuka[j] + remain
                total[j + 1] = cash[j + 1]
            } else {
                kabu[j + 1] = kabu[i + 1]
                cash[j + 1] = cash[i + 1]
                total[j + 1] = total[i + 1]
            }
        }
    }
    println(total.last())
}
