import java.lang.Long.min
import java.lang.Math.ceil

//

fun main() {
    abc185d()
}

fun abc185d() {
    val (n, m) = readLine()!!.split(" ").map { it.toLong() }
    if (m == 0L) {
        println(1)
        return
    }
    var current = 0L
    var stamp = n
    val bluePoint = readLine()!!.split(" ").map { it.toLong() }.toMutableList()
    bluePoint.add(n + 1)
    bluePoint.sort()
    var count = 0L
    var lap = mutableListOf<Long>()
    for (i in bluePoint) {
        val j = i - current - 1L
        if (j > 0L) {
            lap.add(j)
            stamp = min(stamp, j)
        }
        current = i
    }
    
    for (i in lap) {
        count += (ceil(i / stamp.toDouble()).toLong())
    }
    println(count)
}
