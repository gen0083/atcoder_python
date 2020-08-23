//

fun main() {
    arc091b()
}

fun arc091b() {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    var count = 0L
    for (b in k + 1..n) {
        val nn = if (k == 0) n else n + 1
        val cycle = nn / b
        var c = cycle * (b - k)
        val remain = nn % b
        if (remain > k) {
            c += (remain - k)
        }
        count += c
    }
    println(count)
}