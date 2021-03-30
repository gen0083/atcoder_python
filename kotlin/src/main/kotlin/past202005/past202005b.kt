//

fun main() {
    past202005b()
}

fun past202005b() {
    val (n, m, q) = readLine()!!.split(" ").map { it.toInt() }
    val user = Array<MutableSet<Int>>(n + 1) { mutableSetOf() }
    val score = IntArray(m + 1) { n }
    repeat(q) {
        val query = readLine()!!.split(" ")
        when (query[0]) {
            "1"  -> {
                val id = query[1].toInt()
                var total = 0
                for (i in user[id]) {
                    total += score[i]
                }
                println(total)
            }
            
            "2"  -> {
                val id = query[1].toInt()
                val q = query[2].toInt()
                user[id].add(q)
                score[q] -= 1
            }
            
            else -> Unit
        }
    }
}
