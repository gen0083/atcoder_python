import java.lang.Double.min

//

fun main() {
    abc184d()
}

fun abc184d() {
    val (g, s, c) = readLine()!!.split(" ").map { it.toDouble() }
    var gc = if (g != 0.0) 100.0 - g else 0.0
    var sc = if (s != 0.0) 100.0 - s else 0.0
    var cc = if (c != 0.0) 100.0 - c else 0.0
    val total = (g + s + c).toDouble()
    val maxCount = gc + sc + cc
    val minCount = min(gc, min(sc, cc))
    var k = 0.0
    for (i in minCount.toInt().downTo(1)) {
        k += (100 - minCount + i) / (total + i - minCount)
    }
    for (i in minCount.toInt() + 1..maxCount.toInt()) {
        k += i / (total + i - minCount)
    }
    println(k)
}
