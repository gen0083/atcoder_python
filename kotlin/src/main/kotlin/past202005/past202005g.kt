import java.util.*

fun main(args: Array<String>) {
    past202005g()
}

fun past202005g() {
    val (n, x, y) = readLine()!!.split(" ").map { it.toInt() }
    val grid = Array<IntArray>(403) { IntArray(403) { 0 } }
    repeat(n) {
        val (gx, gy) = readLine()!!.split(" ").map { it.toInt() + 201 }
        grid[gy][gx] = -1
    }
    var step = 0
    val queue = ArrayDeque<Position>()
    val goal = Position(x + 201, y + 201)
    queue.add(goal)
    val visited = mutableSetOf(goal)
    while (queue.isNotEmpty()) {
        val searchCount = queue.size
        step++
        repeat(searchCount) {
            val base = queue.pollFirst()
            val tl = Position(base.x - 1, base.y - 1)
            val tc = Position(base.x, base.y - 1)
            val tr = Position(base.x + 1, base.y - 1)
            val l = Position(base.x - 1, base.y)
            val r = Position(base.x + 1, base.y)
            val b = Position(base.x, base.y + 1)
            for (p in listOf(tl, tc, tr, l, r, b)) {
                if (p.x == 201 && p.y == 201) {
                    println(step)
                    return
                }
                p.moveTo(grid, queue, visited, step)
            }
        }
    }
    println(-1)
}

private fun moveStep(grid: Array<IntArray>, queue: ArrayDeque<Position>,
    visited: MutableSet<Position>, step: Int, moveTo: Position): Boolean {
    if (moveTo in visited) return false
    if (moveTo.x !in 0..402 || moveTo.y !in 0..402) return false
    if (grid[moveTo.y][moveTo.x] == -1) return false
    //    if (moveTo.x == 201 && moveTo.y == 201) return true
    grid[moveTo.y][moveTo.x] = step
    visited.add(moveTo)
    queue.add(moveTo)
    return false
}

private data class Position(val x: Int, val y: Int) {
    fun moveTo(grid: Array<IntArray>, queue: ArrayDeque<Position>, visited: MutableSet<Position>,
        step: Int): Boolean = moveStep(grid, queue, visited, step, this)
}

