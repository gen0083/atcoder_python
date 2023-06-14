import kotlin.math.pow

fun main() {
    typical90b()
}

fun typical90b() {
    val n = readLine()!!.toInt()
    if (n % 2 == 1) {
        println()
        return
    }
    for (bit in 0 until (2.0).pow(n).toInt()) {
        val s = buildString {
            for (i in n - 1 downTo 0) {
                if (bit.and(1.shl(i)) == 1.shl(i)) {
                    append(')')
                } else {
                    append('(')
                }
            }
        }
        if (isValid(s)) println(s)
    }
}

private fun isValid(t: String): Boolean {
    var count = 0
    for (element in t) {
        if (element == '(') {
            count += 1
        } else {
            count -= 1
        }
        if (count < 0) return false
    }
    return count == 0
}