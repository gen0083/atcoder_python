fun main(args: Array<String>) {
    arc080b()
}

fun arc080b() {
    val (h, w) = readLine()!!.split(" ").map { it.toInt() }
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    val ans = Array<Array<Int>>(h) { Array<Int>(w) { 0 } }
    var color = 1
    var i = 0
    var j = 0
    var toRight = true
    for (nums in a) {
        repeat(nums) {
            ans[i][j] = color
            if (toRight) {
                j++
            } else {
                j--
            }
            if (toRight && j >= w) {
                j--
                i++
                toRight = false
            }
            if (!toRight && j < 0) {
                j++
                i++
                toRight = true
            }
        }
        color++
    }
    for (line in ans) {
        println(line.joinToString(" "))
    }
}