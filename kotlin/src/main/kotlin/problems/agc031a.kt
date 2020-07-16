// https://atcoder.jp/contests/agc031/tasks/agc031_a

fun main() {
    agc031a()
}

fun agc031a() {
    val n = readLine()!!.toInt()
    val s = readLine()!!
    val BASE_NUM = 1_000_000_007L
    // わからなくて解説見た
    // この問題の条件下においては、各文字の出現位置は無視できるbのあとにaがくることと、bの前にaがあることは同じ
    // abcaaとaaabcは結果的におなじになる
    // ということは、わかりやすくするためにsの各文字を昇順に並べ替えても、この条件下では影響がない
    // 作成できる部分文字列は変わってしまうが、作れる個数の観点からは影響がない
    // よって各文字の出現数+1（+1はその文字を使わない選択肢）が各文字ごとに選択可能であり、
    // これをすべてかけ合わせた数から、全てを選ばないという選択肢の1をひいた数が答えになる
    // 文字の出現位置が重要、という思い込みを崩せなかったのが敗因だろうか
    val reveal = s.groupingBy { it }.eachCount()
    val count = reveal.values.map { (it + 1).toLong() }.reduce { acc, i ->
        acc * i % BASE_NUM
    }
    println(count - 1)
}