//

fun main() {
    abc280d()
}

fun abc280d() {
    val k = readLine()!!.toLong()
    var fac = k
    var i = 2L
    val list = mutableSetOf<Long>()
    while (i * i < fac) {
        if (fac % i == 0L) {
            fac /= i
            list.add(i)
        }
        i++
    }
    if (fac != 1L) list.add(fac)
    println(list.max())
}
