import kotlin.math.abs

// https://atcoder.jp/contests/tenka1-2018-beginner/tasks/tenka1_2018_c

fun main() {
    tenka1_2018c()
}

fun tenka1_2018c() {
    val n = readLine()!!.toInt()
    val a = LongArray(n)
    for (i in 0 until n) {
        a[i] = readLine()!!.toLong()
    }
    a.sort()
    var sum = 0L
    var left = a[0]
    var right = a[0]
    var i = 1
    var j = n - 1
    while (i <= j) {
        // 自分でもなにやってっかよくわかんなくなってきたが、
        // 両端の値を新しい値との差が最大になるように更新していけば良い
        // 値を昇順（別に降順でもいいが）にソートしておいて、小さいもの→大きいものと交互に入れ替えていけば最大になるはず
        // version1では決め打ちで順番に置き換えていったが、それでは対応できないケースが有ったので
        // left/rightのどちらが小さいのかを毎回確認しながら、次の値を入れるように変更した
        // 相変わらず条件分岐がややこしくてデバッグが大変
        val leftMin = left < right
        val edgeMin = if (leftMin) left else right
        val edgeMax = if (leftMin) right else left
        val minSub = abs(edgeMin - a[j])
        val maxSub = abs(edgeMax - a[i])
        if (minSub > maxSub) {
            sum += minSub
            // edgeMin側をjで更新
            if (leftMin) left = a[j] else right = a[j]
            j--
        } else {
            sum += maxSub
            // edgeMax側をiで更新
            if (leftMin) right = a[i] else left = a[i]
            i++
        }
    }
    println(sum)
}