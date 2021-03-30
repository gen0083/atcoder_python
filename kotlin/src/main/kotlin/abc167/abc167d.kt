//

fun main() {
    abc167d()
}

fun abc167d() {
    val (n, k) = readLine()!!.split(" ").map { it.toLong() }
    val town = readLine()!!.split(" ").map { it.toInt() - 1 }
    var i = 0
    val visited = mutableSetOf<Int>(0)
    var isLooped = false
    var checkLooped = false
    var count = 0
    var loopReturnedNum = 0
    while (!checkLooped && count < n) {
        i = town[i]
        count++
        if (visited.contains(i)) {
            checkLooped = true
            loopReturnedNum = i
        } else {
            visited.add(i)
        }
    }
    val loopedCount = count
    var cycleCount = 0
    if (checkLooped) {
        count = 0
        while (!isLooped) {
            i = town[i]
            count++
            if (i == loopReturnedNum) {
                cycleCount = count
                isLooped = true
            }
        }
    }
    val startCount = loopedCount - cycleCount
    val t = ((k - startCount) % cycleCount.toLong())
    i = 0
    if (startCount > k) {
        repeat(k.toInt()) {
            i = town[i]
        }
        println(i + 1)
    } else {
        repeat(t.toInt() + startCount) {
            i = town[i]
        }
        println(i + 1)
    }
}
