fun main() {
    typical90_006()
}

fun typical90_006() {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    val s = readLine()!!
    val next = List(n + 1) { IntArray(26) { n } }
    for (i in n - 1 downTo 0) {
        val alpha = s[i] - 'a'
        for (j in 0..25) {
            next[i][j] = next[i + 1][j]
        }
        next[i][alpha] = i
    }
    var i = 0
    var j = 0
    val ans = buildString {
        while (j < k) {
            val needs = k - j
            var a = 0
            while (a < 26) {
                val length = n - next[i][a]
                if (length > needs) {
                    append(s[next[i][a]])
                    i = next[i][a] + 1
                    j++
                    break
                }
                if (length == needs) {
                    i = next[i][a]
                    append(s.substring(i).toCharArray())
                    j = k
                    break
                }
                a++
            }
        }
    }
    println(ans)
}