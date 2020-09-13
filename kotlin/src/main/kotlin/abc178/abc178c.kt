//

fun main() {
    abc178c()
}

fun abc178c() {
    val n = readLine()!!.toInt()
    var count = 1L
    repeat(n) {
        count = (count * 2L) % 1_000_000_007L
    }
    count = (count - 2L) % 1_000_000_007L
    var c = 1L
    repeat(n - 2) {
        count = (count * 8L) % 1_000_000_007L
    }
    println(count)
}
