// https://atcoder.jp/contests/abc202/tasks/abc202_d

fun main(args: Array<String>) {
    abc202d()
}

fun abc202d() {
//    val scanner = Scanner(System.`in`)
//    val A = scanner.nextInt()
//    val B = scanner.nextInt()
//    val K = scanner.nextLong()
    val (A, B, K) = readLine()!!.split(" ").map { it.toLong() }
    val p = List(A.toInt() + 1) { LongArray(B.toInt() + 1) { 1L } }
    for (a in 1..A.toInt()) {
        for (b in 1..B.toInt()) {
            p[a][b] = p[a - 1][b] + p[a][b - 1]
        }
    }
    var a = A.toInt()
    var b = B.toInt()
    var k = K
    val ans = buildString {
        while (a > 0 && b > 0) {
            if (k > p[a - 1][b]) {
                append("b")
                k -= p[a - 1][b]
                b--
            } else {
                append("a")
                a--
            }
        }
        repeat(a) { append("a") }
        repeat(b) { append("b") }
    }
    println(ans)
}