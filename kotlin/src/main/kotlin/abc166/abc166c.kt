import java.util.*

fun main() {
    abc166c()
}

fun abc166c() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    sc.nextLine()
    val height = sc.nextLine().split(" ").map { it.toInt() }.toIntArray()
    val neighbor = Array<MutableSet<Int>>(n) { mutableSetOf() }
    for (i in 1..m) {
        val a = sc.nextInt() - 1
        val b = sc.nextInt() - 1
        neighbor[a].add(b)
        neighbor[b].add(a)
    }
    var count = 0
    for ((i, e) in neighbor.withIndex()) {
        var hasHeigher = false
        for (s in e) {
            if (height[i] <= height[s]) {
                hasHeigher = true
                break
            }
        }
        if (!hasHeigher) count++
    }
    println(count)
}