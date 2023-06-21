import kotlin.math.*

fun main() {
    typical90_009()
}

fun typical90_009() {
    val n = readLine()!!.toInt()
    val p = mutableListOf<Point>()
    repeat(n) {
        val (x, y) = readLine()!!.split(" ").map { it.toDouble() }
        p.add(Point(x, y))
    }
    var m = 0.0
    for (i in 0 until n) {
        val base = p[i]
        for (j in 0 until n) {
            if (i == j) continue
            val f = p[j]
            val fa = f - base
            val a = atan2(fa.y, fa.x) * 180.0 / PI
            for (k in 0 until n) {
                if (k == i || k == j) continue
                val s = p[k]
                val sb = s - base
                val b = atan2(sb.y, sb.x) * 180.0 / PI
                val arg = min(abs(b - a), 360.0 - abs(b - a))
                m = max(m, arg)
            }
        }
    }
    println(m)
}

private data class Point(val x: Double, val y: Double) {
    operator fun minus(other: Point): Point {
        return Point(this.x - other.x, this.y - other.y)
    }
}