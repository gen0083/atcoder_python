//

fun main() {
    abc171c()
}

fun abc171c() {
    val n = readLine()!!.toLong()
    var tmp = n
    var name = ""
    val nameTable = ('a'..'z').toList()
    while (tmp > 0L) {
        tmp -= 1
        val r = tmp % 26
        name = "${nameTable[r.toInt()]}$name"
        tmp /= 26
    }
    println(name)
}
