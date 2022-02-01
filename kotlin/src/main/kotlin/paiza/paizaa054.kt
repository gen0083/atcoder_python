import java.lang.Integer.max

fun main(args: Array<String>) {
    paizaa054()
}

fun paizaa054() {
    val (n, m, q) = readLine()!!.split(" ").map { it.toInt() }
    val job = mutableMapOf<Int, Int>()
    var x = 0
    repeat(q) {
        val (e, t) = readLine()!!.split(" ").map { it.toInt() }
        val s = (e + n - t) % n
        val p = job.getOrDefault(s, 0) + 1
        job[s] = p
        x = max(x, p)
    }
    println(x)
}