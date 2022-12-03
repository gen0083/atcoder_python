//

fun main() {
    abc280d()
}

fun abc280d() {
    val k = readLine()!!.toLong()
    var fac = k
    var i = 2L
    val list = mutableListOf<Long>()
    while (i * i < fac) {
        if (fac % i == 0L) {
            fac /= i
            list.add(i)
        }
        i++
    }
    if (fac != 1L) list.add(fac)
    if (fac == k) {
        println(fac)
        return
    } else {
        fac = k
        for (j in 1..list.max()!!) {
            if (fac % j == 0L) {
                fac /= j
            }
            if (fac == 1L) {
                println(j)
                return
            }
        }
    }
    println(list.max()!!)
}
