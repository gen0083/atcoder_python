//

fun main() {
    abc172b()
}

fun abc172b() {
    val s = readLine()!!
    val t = readLine()!!
    var count = 0
    for (i in 0 until s.length) {
        if (s[i] != t[i]) count++
    }
    println(count)
}
