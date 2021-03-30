// https://atcoder.jp/contests/abc115/tasks/abc115_d

fun main() {
    abc115d()
}

fun abc115d() {
    val (n, x) = readLine()!!.split(" ").map { it.toLong() }
    val ni = n.toInt()
    val level = LongArray(n.toInt() + 1)
    val patty = LongArray(n.toInt() + 1)
    var base = 2L
    for (i in 0..n.toInt()) {
        base *= 2L
        level[i] = base - 3
        patty[i] = if (i == 0) {
            1L
        } else {
            level[i - 1] + 2
        }
    }
    // 具体的に求めていったら、バーガーの長さはn^(n+2) - 3、そのうちパティの数は2^(n+1)-1になる
    // （1つ前のバーガーレベルの長さに2を加えた数でもある）
    // 見つけたのは完全に偶然、なんか2の累乗に似てるなぁというだけ
    // 漸化式とかで求めたわけではない、求め方わからんし・・・
    // パティは必ず奇数になる
    // あとはを半分半分していけば、計算でパティの枚数を求めることも可能ではなかろうか
    // （2分探索ちっくに中央より食べる数が大きいなら、中央までに存在するパティが食べれるよねっていう話）
    var count = 0L
    var i = ni
    var eat = x
    if (eat >= level[i] - 1) {
        // 端っこはB確定なので、それを覗いた数より大きいならすべてのパティを食べられる
        println(patty[ni])
        return
    }
    while (i > 0 && eat > 0) {
        val half = level[i] / 2 + 1
        if (eat >= level[i]) {
            count += patty[i]
            eat = 0L
            break
        }
        if (eat == half) {
            // 中央パティに到達する数だけ食べられるなら1つ前のレベルのパティと中央のパティが食べられる
            count += patty[i - 1] + 1
            eat = 0L
            break
        }
        if (eat > half) {
            count += patty[i - 1] + 1
            // 中央から半分食べたあまりが持ち越される分
            eat -= half
        } else {
            // 中央まで満たないのであれば、1つ前のレベルで判定する、
            // その際このレベルで付け足された3つのBPB分食べれる数から取り除く
            eat -= 1
        }
        i--
    }
    // 最後に1個残る可能性があり、その場合パティのみ（レベル0が残る）なので残ったeatを足す
    count += eat
    println(count)
}
