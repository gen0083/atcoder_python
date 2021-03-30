// https://atcoder.jp/contests/abc166/tasks/abc166_e

fun main() {
    abc166e()
}

fun abc166e() {
    val n = readLine()!!.toInt()
    val height = readLine()!!.split(" ").map { it.toLong() }
    var count = 0L
    val plus = mutableMapOf<Long, Long>()
    val minus = mutableMapOf<Long, Long>()
    for ((i, v) in height.withIndex()) {
        // これなんでv - iだとダメなの？
        // たぶんv-iにしちゃうと、jがi<jの場合とi>jの場合の区別がつかなくなるからだと思う
        // |i - j| = Ai + Ajだから式変形してAi + i = Aj - jみたいな感じになるんだろうなとは思ったんだが
        // 差の絶対値をどうやって変形するのかがよくわからなかった
        // 常にi>jの数のみ考えればよいようにするためにあえてi - Aiとしてるんだと思う
        // v-iにした場合、すでに数えたやつも同じ値になる可能性があるので重複カウントが生じる可能性がある
        // それを排除してるんだと思う
        val p = i.toLong() + 1L + v
        val m = i.toLong() + 1L - v
        plus[p] = plus.getOrDefault(p, 0L) + 1L
        minus[m] = minus.getOrDefault(m, 0L) + 1L
    }
    for ((key, value) in plus) {
        count += (minus.getOrDefault(key, 0L) * value)
    }
    println(count)
}
