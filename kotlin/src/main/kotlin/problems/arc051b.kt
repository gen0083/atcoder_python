// https://atcoder.jp/contests/arc051/editorial

fun main() {
    arc051b()
}

fun arc051b() {
    val k = readLine()!!.toInt()
    var a = 1L
    var b = 0L
    repeat(k) {
        // bが1以下のときはa+bだとダメ（1で割ったらあまりが0になるので）
        // かといって全部でa+a+bやってたら制約の10^9以内の数の組み合わせに収まらない
        // そのためifで分岐したのだが・・・もっとスマートな方法ないものか
        val t = if (a <= 1L) a + a + b else a + b
        b = a
        a = t
    }
    println("$a $b")
}