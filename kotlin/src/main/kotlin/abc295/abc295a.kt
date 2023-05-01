//

fun main() {
    abc295a()
}

fun abc295a() {
    val n = readLine()!!.toInt()
    val s = readLine()!!.split(" ")
    for (word in s) {
        if (word == "and" ||
            word == "not" ||
            word == "that" ||
            word == "the" ||
            word == "you"
        ) {
            println("Yes")
            return
        }
    }
    println("No")
}
