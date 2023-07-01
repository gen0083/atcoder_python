//

fun main() {
    abc308b()
}

fun abc308b() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val eat = readLine()!!.split(" ")
    val color = readLine()!!.split(" ")
    val p = readLine()!!.split(" ").map { it.toInt() }
    val price = mutableMapOf<String, Int>()
    val def = p[0]
    for (i in 0 until m) {
        price[color[i]] = p[i + 1]
    }
    println(eat.map { price.getOrDefault(it, def) }.sum())
}

