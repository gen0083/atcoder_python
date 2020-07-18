import kotlin.math.abs

//

fun main() {
    tenka1_2018c()
}

fun tenka1_2018c() {
    val n = readLine()!!.toInt()
    val a = LongArray(n)
    for (i in 0 until n) {
        a[i] = readLine()!!.toLong()
    }
    a.sort()
    var sum = 0L
    var left = a[0]
    var right = a[0]
    var i = 1
    var j = n - 1
    var turnMax = true
    // このやり方だと、1,100,100のケースには対応できるがと1,1,100のケースに対応できない
    while (i < j) {
        val (l, r) = if (turnMax) {
            a[j] to a[j - 1]
        } else {
            a[i] to a[i + 1]
        }
        if (turnMax) {
            j -= 2
        } else {
            i += 2
        }
        turnMax = turnMax.not()
        sum += abs(left - l)
        sum += abs(right - r)
        left = l
        right = r
    }
    if (i == j) {
        sum += abs(left - a[i])
    }
    println(sum)
}