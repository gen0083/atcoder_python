fun main(args: Array<String>) {
    abc076c()
}

fun abc076c() {
    val s = readLine()!!
    val t = readLine()!!
    if (s.contains(t)) {
        println(s.replace('?', 'a'))
        return
    }
    for (i in s.length - t.length downTo 0) {
        var isMatch = true
        for (j in 0 until t.length) {
            if (s[i + j] == '?') continue
            if (s[i + j] != t[j]) {
                isMatch = false
                break
            }
        }
        if (isMatch) {
            val r = s.substring(0, i) + t + s.substring(i + t.length, s.length)
            println(r.replace('?', 'a'))
            return
        }
    }
    println("UNRESTORABLE")
}