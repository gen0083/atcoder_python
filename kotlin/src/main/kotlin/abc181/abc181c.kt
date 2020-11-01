//

fun main() {
    abc181c()
}

fun abc181c() {
    val n = readLine()!!.toInt()
    val px = IntArray(n)
    val py = IntArray(n)
    repeat(n) { index ->
        val (x, y) = readLine()!!.split(" ").map { it.toInt() }
        px[index] = x
        py[index] = y
    }
    for (i in 0 until n - 2) {
        for (j in i + 1 until n - 1) {
            
            for (k in j + 1 until n) {
            
            }
        }
    }
    // ななめがあるのを失念してた
    //    val px = IntArray(1001)
    //    val py = IntArray(1001)
    //    val pd = mutableMapOf<Pair<Int, Int>, Int>()
    //    var maxCount = 0
    //    repeat(n) {
    //        val (x, y) = readLine()!!.split(" ").map { it.toInt() }
    //        px[x]++
    //        py[y]++
    //        // gcd(x,y)を求めて割ればxyの比率がわかるので、そこから斜めの直線上にあるものが拾えるのではないか
    //        var dx = x
    //        var dy = y
    //        if (x != 0 && y != 0) {
    //            var i = min(x, y)
    //            var j = max(x, y)
    //            var t = 0
    //            while (j % i != 0) {
    //                t = j
    //                j = i
    //                i = t % i
    //            }
    //            dx = x / i
    //            dy = y / i
    //        }
    //        pd[dx to dy] = pd.getOrDefault(dx to dy, 0) + 1
    //        maxCount = max(px[x], maxCount)
    //        maxCount = max(py[y], maxCount)
    //        maxCount = max(pd.getOrDefault(dx to dy, 0), maxCount)
    //    }
    //    println(if (maxCount >= 3) "Yes" else "No")
}
