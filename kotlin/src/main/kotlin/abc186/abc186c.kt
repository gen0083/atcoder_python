//

fun main() {
    abc186c()
}

fun abc186c() {
    val n = readLine()!!.toInt()
    var count = 0
    for (i in 1..n) {
        val ten = i.toString()
        if (ten.contains('7')) continue
        // to oct
        val oct = i.toString(8)
        if (oct.contains('7')) continue
        count++
    }
    println(count)
}
