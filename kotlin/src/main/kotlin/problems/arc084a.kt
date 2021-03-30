// https://atcoder.jp/contests/arc084/tasks/arc084_a

fun main() {
    arc084a()
}

fun arc084a() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toLong() }
    val b = readLine()!!.split(" ").map { it.toLong() }
    val c = readLine()!!.split(" ").map { it.toLong() }
    val head = a.sortedDescending()
    val middle = b.sortedDescending()
    val bottom = c.sortedDescending()
    val pattern = LongArray(n) { 0L }
    if (head.last() >= middle.first() || middle.last() >= bottom.first()) {
        // 上部のパーツの最も小さいものでさえ、下部の最も大きいパーツより大きいのであればそもそも祭壇を組めない
        println(0)
        return
    }
    var j = n - 1
    // 一度に中段・上段の組み合わせ＋DPの更新をやろうとしてるからおかしくなるのだろうか
    // 上段と中段のみで作れる祭壇の組み合わせを計算する
    for (i in n - 1 downTo 0) {
        if (i < middle.lastIndex) pattern[i] += pattern[i + 1]
        while (j >= 0 && head[j] < middle[i]) {
            j--
        }
        // TODO: refactoring ここの処理もうちょっとわかり易くできないものか
        // j++ただしIndexOutしないようにするってのと、結局jが指してる値がiより小さい値なのか、
        // そもそも小さいものが存在しないのかが判断しなおさないといけないのがなんか気になる
        
        // head[j]がmiddle[i]より大きいindexが示されているので
        j = (j + 1).coerceAtMost(n - 1)
        if (head[j] < middle[i]) {
            pattern[i] += (n - j).toLong()
        }
    }
    // 計算したパターンを使って下部と中段で作れる組み合わせのパターンを求めていく
    var count = 0L
    j = 0
    for (i in 0 until n) {
        while (j < n && middle[j] >= bottom[i]) {
            j++
        }
        count += if (j < n) pattern[j] else 0L
    }
    println(count)
}