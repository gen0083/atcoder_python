import java.lang.Integer.max
import java.lang.Integer.min

//

fun main() {
    abc206d()
}

fun abc206d() {
    val d = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    val p = mutableSetOf<Pair<Int, Int>>()
    val appear = mutableSetOf<Int>()
    val isOdd = d % 2 == 1
    val c = if (isOdd) d / 2 else (d / 2) - 1
    var i = if (isOdd) 1 else 0
    while (i < d / 2) {
        val il = c - i
        val ir = c + i + if (isOdd) 0 else 1
        i++
        if (a[il] == a[ir]) continue
        val pair = min(a[il], a[ir]) to max(a[il], a[ir])
        p.add(pair)
        appear.add(a[il])
        appear.add(a[ir])
    }
    println(min(p.size, appear.size - 1).coerceAtLeast(0))
}
