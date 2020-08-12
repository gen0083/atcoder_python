// https://atcoder.jp/contests/agc023/tasks/agc023_a

fun main() {
    agc023a()
}

fun agc023a() {
    val n = readLine()!!.toInt()
    // プラスとマイナスの値を異なるリストに取り出して、そのリストを使って0となる組み合わせを求めたらよいのでは？
    // ・・・と思ったけれど、それだと単にn^2を2で割ったオーダーになるだけで変わらない上に
    // できあがる部分数列がむちゃくちゃになってしまうので難しい
    // オーダーで解決できないならメモリで殴る作戦だろうか
    // なんのひねりもなくN^2オーダーの実装、当然ながらTLEで話にならない
    val a = readLine()!!.split(" ").map { it.toLong() }
    val table = a.toTypedArray()
    var count: Long = a.count { it == 0L }.toLong()
    for (k in 1 until n - 1) {
        for (i in 0 until n - k) {
            val t = table[i] + a[i + k]
            if (t == 0L) count++
            table[i] = t
        }
    }
    println(count)
}