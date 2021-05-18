import java.lang.Integer.min
import java.util.*

// https://atcoder.jp/contests/abl/tasks/abl_c

fun main() {
    acl1c()
}

fun acl1c() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val root = IntArray(n + 1) { it }
    repeat(m) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        var at = a
        var bt = b
        val stack = ArrayDeque<Int>()
        stack.push(a)
        stack.push(b)
        while (root[at] != at) {
            at = root[at]
            stack.push(at)
        }
        while (root[bt] != bt) {
            bt = root[bt]
            stack.push(bt)
        }
        val t = min(at, bt)
        while (stack.isNotEmpty()) {
            val node = stack.pop()
            root[node] = t
        }
    }
    var count = 0
    for (i in 1..n) {
        if (root[i] == i) count++
    }
    println(count - 1)
}