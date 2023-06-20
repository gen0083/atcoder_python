import kotlin.math.*

fun main() {
    typical90_009()
}

fun typical90_009() {
    val n = readLine()!!.toInt()
    val p = mutableListOf<Pair<Float, Float>>()
    repeat(n) {
        val (x, y) = readLine()!!.split(" ").map { it.toFloat() }
        p.add(x to y)
    }
    var m = 0.0
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (i == j) continue
            for (k in 0 until n) {
                if (k == i || k == j) continue
                val f = p[i]
                val base = p[j]
                val s = p[k]
                val a = (f.first - base.first to f.second - base.second)
                val b = (s.first - base.first to s.second - base.second)
                val c = a.first * b.first + a.second * b.second
                val d = sqrt(a.first.pow(2).toDouble() + a.second.pow(2).toDouble()) * sqrt(
                    b.first.pow(2).toDouble() + b.second.pow(
                        2
                    ).toDouble()
                )
                val theta = acos(c / d) * 180.0 / PI
                if (theta.isNaN()) continue
                m = max(m, theta)
            }
        }
    }
    println(m)
}