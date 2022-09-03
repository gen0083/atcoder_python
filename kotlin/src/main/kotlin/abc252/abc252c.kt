import java.lang.Integer.max

//

fun main() {
    abc252c()
}

fun abc252c() {
    val n = readLine()!!.toInt()
    val s = Array(10) { Array(10) { 0 } }
    repeat(n) {
        val a = readLine()!!.map { it.toString().toInt() }
        for (i in 0..9) {
            s[a[i]][i] += 1
        }
    }
    val count = Array(10) { 0 }
    for (i in 0..9) {
        var maxIndex = 0
        var maxCount = 0
        for (j in 0..9) {
            if (s[i][j] != 0) {
                if (s[i][j] >= maxCount) {
                    maxCount = max(maxCount, s[i][j])
                    maxIndex = j
                }
            }
        }
        count[i] += (maxCount - 1) * 10 + maxIndex
    }
    println(count.min())
}
