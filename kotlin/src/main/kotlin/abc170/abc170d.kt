import java.util.*

//

fun main() {
    abc170d()
}

fun abc170d() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    val queue = ArrayDeque(a.sorted())
    var count = 0
    while (queue.isNotEmpty()) {
        val t = queue.poll()
        var sameNum = false
        val size = queue.size
        repeat(size) {
            val j = queue.poll()
            if (j == t) {
                sameNum = true
            }
            if (j % t != 0) {
                queue.add(j)
            }
        }
        if (!sameNum) count++
    }
    println(count)
}

private fun pattern1() {
    // TLE
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    val unique = a.toSet()
    val sortedUnique = unique.sorted()
    val itemCount = a.groupingBy { it }.eachCount()
    var count = 0
    for (i in sortedUnique.lastIndex downTo 0) {
        if (itemCount[sortedUnique[i]] != 1) continue
        var found = false
        for (j in 0 until i) {
            if (sortedUnique[i] % sortedUnique[j] == 0) {
                found = true
                break
            }
        }
        if (!found) count += itemCount[sortedUnique[i]]!!
    }
    println(count)
}

private fun pattern2() {
    // 結局一緒
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    val queue = ArrayDeque(a.sorted())
    var count = 0
    while (queue.isNotEmpty()) {
        val t = queue.poll()
        var found = 0
        var sameNum = false
        val size = queue.size
        repeat(size) {
            val j = queue.poll()
            if (j == t) {
                sameNum = true
            }
            if (j % t != 0) {
                queue.add(j)
                found++
            }
        }
        if (!sameNum) count++
    }
    println(count)
}