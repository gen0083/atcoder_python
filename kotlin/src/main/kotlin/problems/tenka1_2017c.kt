// https://atcoder.jp/contests/tenka1-2017/tasks/tenka1_2017_c

fun main() {
    tenka1_2017c()
}

fun tenka1_2017c() {
    val n = readLine()!!.toLong()
    var cm = 0L
    var i = 1L
    // h, w, nの組み合わせを全探索すればよい
    // 3つを全探索するのは不可能(3500^3)だが、2つならまだなんとかなる
    // そして2つが決まっていればもう1つを満たす数が存在するかどうかをチェックするだけで良いので、実質2つの数を変数として
    // 2重ループを回して探索すればいい
    // 数学問題である、という思い込みもまた敵である好例
    // プログラムで力技で殴る、制約の隙きを突くのも立派な戦術
    // 分数の存在する四季の式展開が難しくて結局解説見なきゃわからなかったな・・・
    for (i in 1..3500L) {
        for (j in 1..3500L) {
            val t = n * i * j
            val p = 4 * i * j - n * i - n * j
            if (p <= 0L) continue
            if (t % p == 0L) {
                println("$i $j ${t / p}")
                return
            }
        }
    }
}