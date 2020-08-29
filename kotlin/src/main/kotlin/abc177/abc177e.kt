import java.lang.Integer.max
import java.lang.Integer.min

//

fun main() {
    abc177e()
}

fun abc177e() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    val gcds = mutableSetOf<Int>()
    var pairWise = true
    var common = a[0]
    for (i in 0 until n) {
        var j = 1
        var t = 1
        while (j * j <= a[i]) {
            if (a[i] % j == 0) {
                if (j != 1 && j in gcds) {
                    pairWise = false
                    break
                }
                gcds.add(j)
                if (common % j == 0) t = max(t, j)
                val big = a[i] / j
                gcds.add(a[i] / j)
                if (common % big == 0) t = max(t, j)
            }
            j++
        }
        common = min(t, common)
    }
    if (pairWise) {
        println("pairwise coprime")
    } else if (common == 1) {
        println("setwise coprime")
    } else {
        println("not coprime")
    }
}
