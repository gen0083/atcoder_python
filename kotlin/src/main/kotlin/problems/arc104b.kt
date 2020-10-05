//

fun main() {
    arc104b()
}

fun arc104b() {
    val s = readLine()!!.split(" ")
    val n = s[0].toInt()
    val t = s[1]
    var count = 0
    for (i in 0 until n) {
        var ra = 0
        var rt = 0
        var rc = 0
        var rg = 0
        when (t[i]) {
            'A' -> ra++
            'T' -> rt++
            'C' -> rc++
            else -> rg++
        }
        for (j in i + 1 until n) {
            when (t[j]) {
                'A' -> ra++
                'T' -> rt++
                'C' -> rc++
                else -> rg++
            }
            if (ra == rt && rc == rg) count++
        }
    }
    println(count)
}