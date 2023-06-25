import java.util.*

fun main() {
    typical90_012()
}

fun typical90_012() {
    val (h, w) = readLine()!!.split(" ").map { it.toInt() }
    val table = UnionFind(h, w)
    val q = readLine()!!.toInt()
    var color = 1
    repeat(q) {
        val query = readLine()!!.split(" ").map { it.toInt() }
        if (query[0] == 1) {
            // change color
            val a = Cell(query[1], query[2])
            // same color
            table.add(a)
        } else {
            val a = Cell(query[1], query[2])
            val b = Cell(query[3], query[4])
            if (table.same(a, b)) {
                println("Yes")
            } else {
                println("No")
            }
        }
    }
}

private data class Cell(val x: Int, val y: Int)

private class UnionFind(private val row: Int, private val column: Int) {
    private val parent = IntArray(row * column + 1) { -1 }

    fun add(c: Cell) {
        val p = convert(c)
        if (parent[p] != -1) return
        val list = listOf(
                Cell(c.x + 1, c.y),
                Cell(c.x - 1, c.y),
                Cell(c.x, c.y + 1),
                Cell(c.x, c.y - 1)
        )
        val rooted = ArrayDeque<Int>()
        for (cell in list) {
            val po = convert(cell)
            if (po == -1) continue
            if (parent[po] == -1) continue
            rooted.add(root(po))
        }
        if (rooted.isEmpty()) {
            parent[p] = p
        } else if (rooted.size == 1) {
            val r = rooted.pollFirst()
            parent[p] = r
        } else {
            val r = rooted.pollFirst()
            parent[p] = r
            while (rooted.isNotEmpty()) {
                val t = rooted.pollFirst()
                parent[t] = r
            }
        }
    }

    fun root(p: Int): Int {
        if (parent[p] == -1) return -1
        if (parent[p] == p) return p
        val r = root(parent[p])
        parent[p] = r
        return r
    }

    fun same(a: Cell, b: Cell): Boolean {
        val pa = convert(a)
        val pb = convert(b)
        val ra = root(pa)
        val rb = root(pb)
        return ra == rb && ra != -1
    }

    private fun convert(c: Cell): Int {
        val position = (c.y - 1) * row + c.x
        if (position < 0 || position >= parent.size) return -1
        return position
    }
}