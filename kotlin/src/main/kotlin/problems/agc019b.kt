//

fun main() {
    agc019b()
}

fun agc019b() {
    val a = readLine()!!
    val n = a.length.toLong()
    var count = (n - 1) * n / 2 + 1
    val appear = a.groupingBy { it }.eachCount()
    for (value in appear.values) {
        count -= (value * (value - 1) / 2)
    }
    println(count)
}