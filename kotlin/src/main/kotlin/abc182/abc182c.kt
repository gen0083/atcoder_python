//

fun main() {
    abc182c()
}

fun abc182c() {
    val n = readLine()!!.toCharArray()
    val k = n.size
    val list = mutableListOf<String>()
    generatePattern("", n, list, 0)
    list.sortByDescending { it.length }
    for (s in list) {
        val len = s.length
        if (s.toLong() % 3L == 0L) {
            println(k - len)
            return
        }
    }
    println(-1)
}

private fun generatePattern(current: String, table: CharArray, list: MutableList<String>,
    index: Int) {
    if (index == table.size) {
        if (current.isNotEmpty()) list.add(current)
        return
    }
    generatePattern(current, table, list, index + 1)
    generatePattern(current + table[index], table, list, index + 1)
}