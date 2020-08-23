//

fun main() {
    arc091b()
}

fun arc091b() {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    var count = 0L
    for (b in k + 1..n) {
        val cycle = n / b
        var c = n - cycle * k
        val remain = n % b
        if (remain >= k) {
            c -= k - 1
        } else {
            c -= remain
        }
        count += c
    }
    println(count)
}