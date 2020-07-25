// https://atcoder.jp/contests/m-solutions2020/tasks/m_solutions2020_d
// TODO: try to AC
// DP使ってやればできそうなんだけど、相変わらず更新のイメージがうまくもてない
// 変数が多すぎて頭がこんがらがってる

fun main() {
    msolutions2020d()
}

fun msolutions2020d() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    var soko = Int.MAX_VALUE
    var yama = Int.MIN_VALUE
    // 最初に提出したコードで考え方はあってて、ただ答えがIntにおさまらないからオーバーフローでWAになってただけだった
    // N=80日なので、最大で100->200->100->200...と変動する場合、2^40*1000が答えになる可能性がある
    // つまりそれはIntでは収まらない
    // そこに気づいていれば・・・
    // もっとも、このコードはもっと単純化して、単に前日との比較だけですむ
    var current = 1000L
    var searchSoko = true
    for (value in a) {
        if (searchSoko) {
            if (soko > value) {
                soko = value
            } else {
                searchSoko = false
                yama = value
            }
        } else {
            if (yama < value) {
                yama = value
            } else {
                searchSoko = true
                if (yama > soko) {
                    val buy = current / soko
                    current += buy * (yama - soko)
                }
                soko = value
                yama = Int.MIN_VALUE
            }
        }
    }
    if (yama > soko) {
        val buy = current / soko
        current += buy * (yama - soko)
    }
    println(current)
}