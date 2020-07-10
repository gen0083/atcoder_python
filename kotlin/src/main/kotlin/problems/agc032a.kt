// https://atcoder.jp/contests/agc032/tasks/agc032_a
// TODO: try to AC
// 雰囲気はわかる、B(i)の値とi番目の関係から、実現が不可能とか、何番目〜何番目の間に挿入が必要とかはわかる
// ただ、その結果プログラムとしてどう組み上げるのかがわからん
// というかこれはあれかな、全組み合わせを試すのが手っ取り早いのだろうか
// ただし、操作とその結果に出来上がる数列の並び順が違うのがまたややこしさを上げてる

fun main() {
    agc032a()
}

fun agc032a() {
    val n = readLine()!!.toInt()
    val b = readLine()!!.split(" ").map { it.toInt() }
    if (isImpossible(b)) {
        println(-1)
        return
    }
    println(1)
}

private fun isImpossible(values: List<Int>): Boolean {
    for (i in values.indices) {
        if (values[i] > i + 1) return true
    }
    return false
}