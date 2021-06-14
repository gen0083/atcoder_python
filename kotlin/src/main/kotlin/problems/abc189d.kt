fun main(args: Array<String>) {
    abc189d()
}

fun abc189d() {
    val n = readLine()!!.toInt()
    // y_iがtrueになるパターン数をcount[0]、falseになるときをcount[1]とする
    val count = longArrayOf(1L, 1L)
    for (i in 1..n) {
        val s = readLine()!!
        val yTrue = count[0]
        val yFalse = count[1]
        if (s == "AND") {
            count[0] = yTrue
            count[1] = yTrue + yFalse * 2
        } else {
            count[0] = yTrue * 2 + yFalse
            count[1] = yFalse
        }
    }
    println(count[0])
}