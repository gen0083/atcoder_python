fun main() {
    ddcc2020c()
}

fun ddcc2020c() {
    val (h, w, k) = readLine()!!.split(" ").map { it.toInt() }
    var num = 1
    var repeatCount = 0
    val prev = IntArray(w)
    repeat(h) {
        val line = readLine()!!
        if (line.count { it == '#' } == 0) {
            repeatCount++
        } else {
            var foundFirst = false
            for (i in 0 until w) {
                if (line[i] == '#') {
                    if (foundFirst) {
                        num++
                    } else {
                        foundFirst = true
                    }
                }
                prev[i] = num
            }
            num++
            println(prev.joinToString(" "))
            if (repeatCount > 0) {
                repeat(repeatCount) {
                    println(prev.joinToString(" "))
                }
                repeatCount = 0
            }
        }
    }
    if (repeatCount > 0) {
        repeat(repeatCount) {
            println(prev.joinToString(" "))
        }
    }
}