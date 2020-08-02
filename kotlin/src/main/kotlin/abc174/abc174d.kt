//

fun main() {
    abc174d()
}

fun abc174d() {
    val n = readLine()!!.toInt()
    val s = readLine()!!
    var count = 0
    var leftWhite = 0
    var rightRed = s.count { it == 'R' }
    var i = 0
    if (rightRed == 0) {
        println(0)
        return
    }
    while (i < n) {
        if (s[i] == 'W') {
            leftWhite++
        } else {
            rightRed--
        }
        if (leftWhite > 0 && rightRed > 0) {
            leftWhite--
            rightRed--
            count++
        } else if (leftWhite > 0) {
            leftWhite--
            count++
        }
        i++
        if (leftWhite + rightRed == 0) break
    }
    println(count)
}
