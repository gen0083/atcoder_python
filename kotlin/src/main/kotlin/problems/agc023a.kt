// https://atcoder.jp/contests/agc023/tasks/agc023_a

fun main() {
    agc023a()
}

fun agc023a() {
    val n = readLine()!!.toInt()
    // 解説見てAC
    // (解説では並び替え、とあったが結局各数値の出現回数を求めることと一緒なので、ソートではなく集計を行っている)
    // table[i]（解説ではSi）はA_0~iまでの合計を表している
    // たとえばtable[3]=4でtable[6]=4のとき、A_4,5,6の合計が0であることを示す、ということか
    // ということは、同じ数値が出現している区間において合計が0となる部分文字列が存在していることがいえる
    // したがって、同じ数値がいくつ出現するかがわかればその区間に0となる部分数列が存在していることがわかるということ
    // よって順番を並び替えたりしても答えに影響がない
    // 注意すべきは同じ数値の「間に」カウントしたい0となる部分数列があるので、同じ数値の出現個数を単純に合計してはいけないということ
    // また出現個数の分だけ組み合わせが発生もするので、和の公式を用いて数を求める必要がある
    val a = readLine()!!.split(" ").map { it.toLong() }
    val table = Array<Long>(n + 1) { 0L }
    for (i in 0 until n) {
        table[i + 1] = table[i] + a[i]
    }
    val counts = table.groupingBy { it }.eachCount()
    var count = 0L
    for (v in counts.values) {
        if (v > 1) {
            // こういうところでIntでオーバーフローが起きてしまうので注意が必要
            count += (v - 1) * v.toLong() / 2L
        }
    }
    println(count)
}