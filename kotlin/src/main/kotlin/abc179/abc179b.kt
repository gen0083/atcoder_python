//

fun main() {
    abc179b()
}

fun abc179b() {
    val n = readLine()!!.toInt()
    var count = 0
    repeat(n) {
        val (a, b) = readLine()!!.split(" ")
        if (a == b) {
            count++
        } else {
            count = 0
        }
        if (count >= 3) {
            println("Yes")
            return
        }
    }
    println("No")
}
