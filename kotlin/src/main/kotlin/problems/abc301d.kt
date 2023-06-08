fun main() {
    abc301d()
}

fun abc301d() {
    val sr = readLine()!!.reversed()
    val n = readLine()!!.toLong()
    var i = 0
    var j = 1L
    val bi = LongArray(sr.length) { 1L }
    var f = 0L
    val v = mutableSetOf<Long>()
    while (i < sr.length) {
        bi[i] = j
        if (sr[i] == '1') {
            f += j
        } else if (sr[i] == '?') {
            v.add(j)
        }
        j *= 2L
        i++
    }
    if (f > n) {
        println("-1")
        return
    }
    val sorted = v.sortedDescending()
    for (l in sorted) {
        if (f + l > n) continue
        f += l
    }
    println("$f")
}