import java.lang.Long.min
import kotlin.math.abs

//

fun main() {
    abc184c()
}

fun abc184c() {
    val (r1, c1) = readLine()!!.split(" ").map { it.toLong() }
    val (r2, c2) = readLine()!!.split(" ").map { it.toLong() }
    val gr = abs(r2 - r1)
    val gc = abs(c2 - c1)
    if (gr == 0L && gc == 0L) {
        println(0)
        return
    }
    val p = gr + gc
    val m = abs(gr - gc)
    val dmin = min(p, m)
    if (dmin == 0L || gr + gc <= 3L) {
        // ななめ移動のみもしくは3マス移動で到達可能ってこと
        println(1)
    } else {
        // ここはカンだけどね・・・
        if (dmin % 2L == 0L || dmin <= 3L) {
            println(2)
        } else {
            println(3)
        }
    }
}
