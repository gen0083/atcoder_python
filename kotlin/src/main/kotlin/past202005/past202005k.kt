fun main(args: Array<String>) {
    past202005k()
}

fun past202005k() {
    val (n, q) = readLine()!!.split(" ").map { it.toInt() }
    val desks = mutableListOf<Box.Desk>()
    val containers = mutableListOf<Box.Container>()
    for (i in 1..n) {
        val d = Box.Desk(i, null)
        val c = Box.Container(i, d, null)
        d.next = c
        desks.add(d)
        containers.add(c)
    }
    repeat(q) {
        val (f, x, t) = readLine()!!.split(" ").map { it.toInt() }
        val target = containers[x - 1]
        if (containers[x - 1].prev is Box.Desk) {
            desks[f - 1].next = null
        }
        
    }
}

private sealed class Box(open val number: Int) {
    
    data class Desk(override val number: Int, var next: Container?) : Box(number)
    
    data class Container(override val number: Int, var prev: Box, var next: Box?) : Box(number)
}