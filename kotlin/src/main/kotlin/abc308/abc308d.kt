import java.util.*

//

fun main() {
    abc308d()
}

fun abc308d() {
    val (h, w) = readLine()!!.split(" ").map { it.toInt() }
    val template = "snuke"
    val grid = mutableListOf<String>()
    grid.add(buildString { repeat(w + 2) { append(" ") } })
    repeat(h) {
        val s = readLine()!!
        grid.add(" $s ")
    }
    grid.add(buildString { repeat(w + 2) { append(" ") } })
    val stack = ArrayDeque<Pair<Int, Int>>()
    stack.add(1 to 1)
    val visited = mutableSetOf<Pair<Int, Int>>()
    var t = 0
    while (stack.isNotEmpty()) {
        val i = stack.size
        for (j in 0 until i) {
            val (column, row) = stack.pollFirst()
            if (column to row in visited) continue
            visited.add(column to row)
            if (grid[column][row] != template[t]) continue
            if (column == h && row == w) {
                println("Yes")
                return
            }
            stack.add(column + 1 to row)
            stack.add(column - 1 to row)
            stack.add(column to row + 1)
            stack.add(column to row - 1)
        }
        t = (t + 1) % 5
    }
    println("No")
}
