//

fun main() {
    abc203c()
}

fun abc203c() {
    val (n, k) = readLine()!!.split(" ").map { it.toLong() }
    val friends = mutableListOf<Friends>()
    repeat(n.toInt()) {
        val (a, b) = readLine()!!.split(" ").map { it.toLong() }
        friends.add(Friends(a, b))
    }
    friends.sortBy { it.position }
    var current = k
    var i = 0
    while (i < friends.size && current >= friends[i].position) {
        current += friends[i].present
        i++
    }
    println(current)
}

private data class Friends(val position: Long, val present: Long)