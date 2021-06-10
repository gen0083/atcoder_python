import java.lang.Integer.max

// https://atcoder.jp/contests/abc204/tasks/abc204_d
// 部分和問題　だろうなとは思いつつも理解するところまでやってないから結局わからないっていうね
/**
最適化問題はそのままでは解くのが難しい（NP困難とかそんなやつの話、理解できてない）
しかしこれを判定問題に置き換えることができるものがあって、そうすると考えやすくなる
この問題でいえば、N個の料理のうちi個を選んだときにS時間で作ることができるか、という判定問題にすると解きやすくなる
しない場合、すべての組み合わせを考慮して合計時間を求めて、その中から最小となる時間を出力する=2^100となるので不可能）
この問題では、オーブンが1つしかないとすべての料理の合計時間（total）かかる
2つにすると、理想的にはtotalの半分（偶数なら半分、奇数なら半分+1になるので(total + 1) / 2で計算すると早い）
しかし必ずしもそれが実現できるかは不明
そこで料理iを選んだときに実現できる合計時間を計算していく
dp[i][j]を料理iまでの中から任意のものを選び、料理時間合計がj分となる組み合わせが存在するかどうかを表すBooleanArrayとする
（実現可能な時間の組み合わせを求めて、そこから理想時間から順に確認していきもっとも早く実現可能なものが答えになる）
動的計画法にはpullベースとpushベースの考え方があって、今回はpushベースで考えるとわかりやすい
pullベース　->　dp[i]にそれまでのdp[i-1]の結果を見て値を更新していく、個人的にイメージしやすい
pushベース -> dp[i-1]をもとに新たなデータを配っていくイメージ、今回のようなやつ
どちらも直前の計算結果さえあればできるので、確保するメモリ領域は減らそうと思えば減らせる
今回のような問題だと、メモリ空間無駄じゃねってこのようなデータのとり方を考慮外にしてしまう傾向がある

帰着する先が2^N(最大1267650600228229401496703205376) → NTi（最大100,000）にできる
こう数字に表してみると、ほぼfalseで埋まってる無駄に思えるメモリ空間も、めちゃくちゃ効率良くなってることがわかる

抵抗感があった部分
- 実現できる料理時間を1ずつ増やして順に見ていく部分
　-> 非効率的だと思ったけど、上記のように数字で表すと削減できてる
- 漸化式がよくわからない
　-> 漸化式はt[i] = t[i - 1] + t[i - 2]みたいなやつのこと,再帰関数式
　　　https://ja.wikipedia.org/wiki/%E6%BC%B8%E5%8C%96%E5%BC%8F
- pushベースの動的計画法がイメージしにくい
　-> dp[i][j]の値はdp[i-1][j]とdp[i-1][j+t[i-1]]で更新されるので、微妙なズレがあって混乱したように思う
　　　dpの[i]が1index的に使ってるのに対してt[i]は0indexになってるのもやりにくい

計算量を考慮して問題に取り組むことはできるようになった
→メモリ空間の制約もうまく使って取り組めるようになるとよい
この問題のように、2^Nオーダーを比較的少ないメモリ空間をループするだけで終わらせれるようになる
→動的計画法をpushベースで考える方法もある
pullベースでしか考えられてなかったので、今回を機にpushベースで更新していけば解決できるパターンもあるとしれた
ただし、pullベースのように漸化式をうまく立てられるほど理解はできてないので、もっと場数を踏まないとダメそう
 **/

fun main() {
    abc204d()
}

fun abc204d() {
    val n = readLine()!!.toInt()
    val t = readLine()!!.split(" ").map { it.toInt() }
    val total = t.sum()
    // 実際には直前の実行結果とそこから分配した結果さえ区別できればよいので、このようにデータ量によらず2行用意すれば足りる
    val dp = List(2) { BooleanArray(total + 1) { false } }
    dp[0][0] = true
    dp[1][0] = true
    var m = 0
    for (i in 0 until n) {
        for (j in 0..m) {
            // そうした結果、行へのアクセスがややこしくなるのでコードの見通しは悪くなる
            if (dp[i % 2][j]) {
                dp[(i + 1) % 2][j] = true
                dp[(i + 1) % 2][j + t[i]] = true
                m = max(m, j + t[i])
            }
        }
    }
    for (i in ((total + 1) / 2)..total) {
        // dpは0indexで+1まで更新される / n=100ならi=99でi+1が最終計算結果として集計されるのでn%2でアクセスできるものが最終結果
        if (dp[n % 2][i]) {
            println(i)
            break
        }
    }
}

private fun solveByDp() {
    val n = readLine()!!.toInt()
    val t = readLine()!!.split(" ").map { it.toInt() }
    val total = t.sum()
    val dp = List(n + 2) { BooleanArray(total + 1) { false } }
    dp[0][0] = true
    var m = 0
    for (i in 1..n) {
        for (j in 0..total) {
            if (j >= m) break
            if (dp[i - 1][j]) {
                dp[i][j] = true
                dp[i][j + t[i - 1]] = true
                m = max(m, j + t[i - 1])
            }
        }
    }
    for (i in ((total + 1) / 2)..total) {
        if (dp[n][i]) {
            println(i)
            break
        }
    }
}

private fun solveBySet() {
    // 今回の問題だとSetを使ってやっても通った
    // ただし使用メモリ量も実行時間もこっちのほうがパフォーマンス悪い
    val n = readLine()!!.toInt()
    val t = readLine()!!.split(" ").map { it.toInt() }
    val total = t.sum()
    var dp = mutableSetOf(0)
    for (i in t) {
        val possible = mutableSetOf<Int>().apply { addAll(dp) }
        for (j in dp) {
            possible.add(j + i)
        }
        dp = possible
    }
    val a = dp.toList().sorted()
    for (i in a) {
        if (i >= ((total + 1) / 2)) {
            println(i)
            break
        }
    }
}