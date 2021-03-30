//

fun main() {
    abc171d()
}

fun abc171d() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toLong() }
    val q = readLine()!!.toInt()
    var items = a.groupingBy { it }.eachCount().toMutableMap()
    var total = a.sum()
    repeat(q) {
        val (b, c) = readLine()!!.split(" ").map { it.toLong() }
        if (b in items) {
            val count = items[b]!!
            val temp = b * count
            total -= temp
            total += c * count
            items[b] = 0
            items[c] = count + items.getOrDefault(c, 0)
        }
        println(total)
    }
}
