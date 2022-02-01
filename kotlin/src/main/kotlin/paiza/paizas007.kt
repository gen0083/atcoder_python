import java.util.*

fun main(args: Array<String>) {
    paizas007()
}

fun paizas007() {
    val s = readLine()!!.trim()
    var i = 0
    var factor = 1L
    val fStack = Stack<Long>()
    val cStack = Stack<MutableMap<Char, Long>>()
    var current = mutableMapOf<Char, Long>()
    while (i < s.length) {
        when {
            s[i].isDigit() -> {
                val j = buildString {
                    while (s[i].isDigit()) {
                        append(s[i])
                        i++
                    }
                }.toLong()
                i--
                factor = j
            }
            s[i] == '(' -> {
                fStack.push(factor)
                factor = 1L
                cStack.push(current)
                current = mutableMapOf()
            }
            s[i] == ')' -> {
                factor = fStack.pop()
                val prev = cStack.pop()
                for ((k, v) in current) {
                    prev[k] = prev.getOrDefault(k, 0) + v * factor
                }
                current = prev
                factor = 1L
            }
            else -> {
                val appear = factor
                current[s[i]] = current.getOrDefault(s[i], 0) + appear
                if (factor != 1L) {
                    factor = 1L
                }
            }
        }
        i++
    }
    for (c in 'a'..'z') {
        val count = current.getOrDefault(c, 0)
        println("$c $count")
    }
}