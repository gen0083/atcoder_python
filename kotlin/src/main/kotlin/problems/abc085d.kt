import java.util.*

//

fun main() {
    abc085d()
}

fun abc085d() {
    val (ns, hs) = readLine()!!.split(" ")
    val n = ns.toInt()
    var h = hs.toLong()
    val priorityQueue = PriorityQueue<Katana> { o1, o2 -> (o2.damage - o1.damage).toInt() }
    repeat(n) {
        val (a, b) = readLine()!!.split(" ").map { it.toLong() }
        priorityQueue.add(Katana(a, true))
        priorityQueue.add(Katana(b, false))
    }
    var count = 0L
    while (h > 0L) {
        val k = priorityQueue.poll()
        h -= k.damage
        count++
        if (k.repeat) {
            val r = h / k.damage
            h -= k.damage * r
            count += r
            if (h > 0L) {
                h -= k.damage
                count++
            }
        }
    }
    println(count)
}

private data class Katana(val damage: Long, val repeat: Boolean)