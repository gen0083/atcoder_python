fun main(args: Array<String>) {
    zone01()
}

fun zone01() {
    val n = readLine()!!.toInt()
    repeat(n) {
        val s = readLine()!!
        println(rot13(s))
    }
}

fun zone02() {
    var count = 0
    repeat(20) {
        val num = readLine()!!.split(" ").map { it.toInt() }
        a@ for (i in num) {
            if (i == 1) continue
            if (i == 2) {
                count++
                continue
            }
            var j = 2
            while (j * j <= i) {
                if (i % j == 0) {
                    continue@a
                }
                j++
            }
            count++
        }
    }
    println(count)
}

fun zone03() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val planets = List(n) { mutableSetOf(it) }
    repeat(m) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        planets[a].add(b)
        planets[b].add(a)
    }
    var maximum = 0
    var ans = listOf<Int>()
    for (i in 0 until n - 2) {
        for (j in i + 1 until n - 1) {
            for (k in j + 1 until n) {
                val s = planets[i] + planets[j] + planets[k]
                if (s.size > maximum) {
                    maximum = s.size
                    ans = listOf(i, j, k)
                }
            }
        }
    }
    println(ans.joinToString(" "))
}

private fun rot13(source: String): String {
    return buildString {
        for (c in source) {
            val base = c - 'a'
            val convert = (base + 13) % 26
            val a = 'a' + convert
            append(a)
        }
    }
}