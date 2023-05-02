fun main() {
    abc298d()
}

fun abc298d() {
    var s = mutableListOf<Char>()
    var t = 0
    val q = readLine()!!.toInt()
    val d = 998244353
    repeat(q) {
        val query = readLine()!!.split(" ").map { it.toInt() }
        when (query[0]) {
            1 -> s.add(query[1].toChar())
            2 -> t++
            else -> {
                s.joinToString()
            }
        }
    }
}