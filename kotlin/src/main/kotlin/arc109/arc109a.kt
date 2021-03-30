import java.lang.Integer.min

//

fun main() {
    arc109a()
}

fun arc109a() {
    val (a, b, x, y) = readLine()!!.split(" ").map { it.toInt() }
    val timeA = IntArray(102)
    val timeB = IntArray(102)
    if (a <= b) {
        // 登るパターン
        timeB[a - 1] = x
        for (i in a..b) {
            timeA[i + 1] = min(timeA[i] + y, timeA[i] + x + x)
            timeB[i] = if (i == 1) x else min(timeA[i] + x, timeB[i - 1] + y)
        }
    } else {
        // 下るパターン
        timeB[a + 1] = x
        for (i in a.downTo(b)) {
            timeB[i] = if (i == 100) {
                min(timeA[i + 1] + x, timeB[i + 1] + y)
            } else {
                min(timeA[i + 1] + x, min(timeA[i] + x, timeB[i + 1] + y))
            }
            timeA[i - 1] = min(timeA[i] + y, timeA[i] + x + x)
        }
    }
    println(timeB[b])
}
