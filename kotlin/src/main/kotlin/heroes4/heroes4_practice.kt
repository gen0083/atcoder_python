fun main() {
    heroes4_practice()
}

fun heroes4_practice() {
    d()
}

private fun c() {
    val n = readLine()!!.toInt()
    repeat(n) {
        var factor = 10
        val input = readLine()!!.toInt()
        val roundNumbers = mutableListOf<Int>()
        var t = input
        while (t > 0) {
            val test = t % factor
            if (test != 0) {
                t -= test
                roundNumbers.add(test)
            }
            factor *= 10
        }
        println(roundNumbers.size)
        println(roundNumbers.joinToString(" "))
    }
}

private fun d() {
    val n = readLine()!!.toInt()
    repeat(n) {
        val m = readLine()!!.toInt()
        val candies = readLine()!!.split(" ").map { it.toInt() }
        var alice = candies[0]
        var bob = 0
        var temp = 0
        var prev = alice
        var i = 1
        var j = candies.lastIndex
        var move = 1
        while (i + 1 < j) {
            while (temp <= prev) {
                bob += candies[j]
                temp += candies[j]
                if (i + 1 < j) {
                    j--
                } else {
                    break
                }
            }
            move++
            prev = temp
            temp = 0
            if (i >= j) break
            while (temp <= prev) {
                alice += candies[i]
                temp += candies[i]
                if (j - 1 > i) {
                    i++
                } else {
                    break
                }
            }
            move++
            prev = temp
            temp = 0
            if (i >= j) break
        }
        println("$move $alice $bob")
    }
}