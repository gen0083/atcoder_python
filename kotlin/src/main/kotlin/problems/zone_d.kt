import java.util.*

fun main(args: Array<String>) {
    zone_d()
}

fun zone_d() {
    val t = ArrayDeque<Char>()
    val s = readLine()!!
    var isReversed = false
    for (c in s) {
        if (c == 'R') {
            isReversed = !isReversed
            continue
        }
        if (isReversed) {
            if (t.isEmpty() || t.first != c) {
                t.push(c)
            } else {
                t.pollFirst()
            }
        } else {
            if (t.isEmpty() || t.last != c) {
                t.add(c)
            } else {
                t.pollLast()
            }
        }
    }
    if (isReversed) {
        println(t.reversed().joinToString(""))
    } else {
        println(t.joinToString(""))
    }
}