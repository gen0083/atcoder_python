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
        // 26進数で0〜25をそれぞれa~zに割り当ててやれば良い
        // ややこしいのは与えられる数値は1indexで、26進数は0indexってところ
        tmp -= 1
        val r = tmp % 26
        name = "${nameTable[r.toInt()]}$name"
        tmp /= 26
    }
    println(name)
}
