//

fun main() {
    abc173a()
}

fun abc173a() {
    val n = readLine()!!.toInt()
    if (n % 1000 == 0) {
        println(0)
    } else {
        println(1000 - (n % 1000))
    }
}
