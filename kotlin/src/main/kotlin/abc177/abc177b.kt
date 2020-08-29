import java.lang.Integer.min

//

fun main() {
    abc177b()
}

fun abc177b() {
    val s = readLine()!!
    val t = readLine()!!
    var count = 1000
    for (i in 0..s.length - t.length) {
        var c = 0
        for (j in t.indices) {
            if (s[i + j] != t[j]) c++
        }
        count = min(count, c)
    }
    println(count)
}
