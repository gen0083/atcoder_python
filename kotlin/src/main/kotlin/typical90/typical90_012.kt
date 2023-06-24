import java.util.*

fun main() {
    typical90_012()
}

fun typical90_012() {
    val (h, w) = readLine()!!.split(" ").map { it.toInt() }
    val table = List(h + 2) { IntArray(w + 2) { -1 } }
    val q = readLine()!!.toInt()
    var color = 1
    repeat(q) {
        val query = readLine()!!.split(" ").map { it.toInt() }
        if (query[0] == 1) {
            // change color
            val a = Cell(query[1], query[2])
            // same color
            if (table[a.x][a.y] == -1) {
                val stack = ArrayDeque<Cell>()
                stack.add(a)
                while (stack.isNotEmpty()) {
                    val time = stack.size
                    for (i in 0 until time) {
                        val c = stack.pollFirst()
                        table[c.x][c.y] = color
                        val list = listOf(
                                Cell(c.x - 1, c.y),
                                Cell(c.x + 1, c.y),
                                Cell(c.x, c.y - 1),
                                Cell(c.x, c.y + 1)
                        )
                        for (t in list) {
                            if (table[t.x][t.y] == -1) continue
                            if (table[t.x][t.y] == color) continue
                            stack.add(t)
                        }
                    }
                }
                color += 1
            }
        } else {
            val a = Cell(query[1], query[2])
            val b = Cell(query[3], query[4])
            if (table[a.x][a.y] == table[b.x][b.y] && table[a.x][a.y] != -1) {
                println("Yes")
            } else {
                println("No")
            }
        }
    }
}

private data class Cell(val x: Int, val y: Int)