//

fun main() {
    arc111a()
}

fun arc111a() {
    val (ns, ms) = readLine()!!.split(" ")
    val m = ms.toInt()
    val t = m * m
    val a = t.toString().length
    if (ns.length <= a) {
        val n = ns.toLong()
        val b = n / m
        println(b % m)
    } else {
        val c = 100000 / m
        if (c > m) {
            println(c % m)
        } else {
            println(c)
        }
    }
}
