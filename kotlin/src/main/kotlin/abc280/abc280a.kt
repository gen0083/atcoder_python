//

fun main() {
    abc280a()
}

fun abc280a() {
    val (h, w) = readLine()!!.split(" ").map { it.toInt() }
    var count = 0
    repeat(h) {
        val s = readLine()!!
        count += s.count { it == '#' }
    }
    println(count)
}
