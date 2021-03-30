fun main(args: Array<String>) {
    abc048b()
}

fun abc048b() {
    val (a, b, x) = readLine()!!.split(" ").map { it.toLong() }
    //    var result = (b - a) / x
    //    if (a % x == 0L) result++
    //    println(result)
    val big = b / x
    val small = a / x
    println(big - small + if (a % x == 0L) 1 else 0)
}