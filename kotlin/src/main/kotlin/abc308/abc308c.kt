//

fun main() {
    abc308c()
}

fun abc308c() {
    val n = readLine()!!.toInt()
    val c = mutableListOf<Coin>()
    repeat(n) {
        val (a, b) = readLine()!!.split(" ").map { it.toLong() }
        c.add(Coin(it + 1, a, b))
    }
    c.sort()
    println(c.joinToString(separator = " ") { it.i.toString() })
}

private data class Coin(val i: Int, val a: Long, val b: Long) : Comparable<Coin> {
    override fun compareTo(o: Coin): Int {
        val f2 = o.a * (this.a + this.b)
        val f1 = this.a * (o.a + o.b)
        return when {
            f1 > f2 -> -1
            f1 == f2 -> 0
            else -> 1
        }
    }
}