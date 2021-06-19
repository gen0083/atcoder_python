//

fun main() {
    abc206a()
}

fun abc206a() {
    val n = readLine()!!.toInt()
    var t = n * 108
    val price = t / 100
    when {
        price < 206 -> println("Yay!")
        price == 206 -> println("so-so")
        else -> println(":(")
    }
}
