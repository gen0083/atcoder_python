//

fun main() {
    abc306c()
}

fun abc306c() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    val m = IntArray(n + 1) { 0 }
    val ans = mutableListOf<Int>()
    for (i in a) {
        m[i]++
        if (m[i] == 2) ans.add(i)
    }
    println(ans.joinToString(" "))
}
