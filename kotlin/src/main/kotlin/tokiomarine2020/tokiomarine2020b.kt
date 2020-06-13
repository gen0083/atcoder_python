//

fun main() {
    tokiomarine2020b()
}

fun tokiomarine2020b() {
    val (a, v) = readLine()!!.split(" ").map { it.toLong() }
    val (b, w) = readLine()!!.split(" ").map { it.toLong() }
    val t = readLine()!!.toLong()
    if (v <= w) {
        // 永遠に追いつけない
        println("NO")
        return
    }
    var oni = a
    var child = b
    for (i in 1..t) {
        if (oni == child) {
            println("YES")
            return
        }
        if (oni > child) {
            oni -= v
            child -= w
        } else {
            oni += v
            child += w
        }
    }
    println("NO")
}
