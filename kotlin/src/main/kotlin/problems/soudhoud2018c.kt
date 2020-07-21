// https://atcoder.jp/contests/soundhound2018-summer-qual/tasks/soundhound2018_summer_qual_c

fun main() {
    soundhound2018c()
}

fun soundhound2018c() {
    val (n, m, d) = readLine()!!.split(" ").map { it.toLong() }
    var beauty = 0.0
    var count = 0L
    if (d == 0L) {
        count = n
    } else {
        for (i in 1..n) {
            if (i - d > 0L) count++
            if (i + d <= n) count++
        }
    }
    // 当然、10^9の長さもあるわけだから、全パターンの美しさの合計を求めてから件数で割る、なんてことはできない
    // （分母となるn^m自体がオーバーフローしてしまうので）
    // ということはそもそも計算の仕方を工夫する必要がある問題ということ
    // 数学的にこうやれば答えが出る、という確信はないが、条件的にこうやれば求まるんじゃねというのを小さい例を使って
    // なんとなく求めて、なんかいけそうだったのでコードに起こしてみたらあってたという感じ
    // まずmが2だったと仮定したときの美しさの平均値を求める
    beauty = count.toDouble() / n / n
    var t = beauty
    // m + 1の美しさの平均は、直前の美しさの平均に差がdとなる組み合わせの個数/nをかけたものを合計したやつ
    for (i in 2 until m) {
        // これってつまりtだからtのまま足し続ければよかった
        //        t = t * count / n
        beauty += t
    }
    // そのままだと指数表記（1.80705999e-6とか）になるのでサンプルの出力に合わせてみた
    // 指数表記でも受け付けられるっぽいので気にしなくていいかも
    println("%.10f".format(beauty))
}