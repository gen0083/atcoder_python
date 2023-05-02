fun main() {
    abc299d()
}

fun abc299d() {
    val n = readLine()!!.toInt()
    var l = 1
    var r = n
    var c = (l + r) / 2
    for (i in 0..20) {
        if (l + 1 == r) break
        println("? $c")
        val ans = readLine()!!.toInt()
        if (ans == 0) {
            l = c
        } else {
            r = c
        }
        c = (l + r) / 2
    }
    println("! $c")
}