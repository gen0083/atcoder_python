//

fun main() {
    abc280c()
}

fun abc280c() {
    val s = readLine()!!
    val t = readLine()!!
    for (i in s.indices) {
        if (s[i] != t[i]) {
            println(i + 1)
            return
        }
    }
    println(t.length)
}
