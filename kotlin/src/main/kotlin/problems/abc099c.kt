//

fun main() {
    abc099c()
}

fun abc099c() {
    val n = readLine()!!.toInt()
    val pay = mutableSetOf(1, 6, 9)
    var six = 6
    var nine = 9
    while (six <= n || nine <= n) {
        six *= 6
        if (six <= n) pay.add(six)
        nine *= 9
        if (nine <= n) pay.add(nine)
    }
    var step = 1
    var base = mutableSetOf(0)
    while (base.isNotEmpty()) {
        val next = mutableSetOf<Int>()
        for (b in base) {
            for (p in pay) {
                val t = b + p
                if (t > n) continue
                if (t == n) {
                    println(step)
                    return
                }
                next.add(t)
            }
        }
        step++
        base = next
    }
}
