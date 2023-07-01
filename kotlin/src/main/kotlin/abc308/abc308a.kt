//

fun main() {
    abc308a()
}

fun abc308a() {
    val s = readLine()!!.split(" ").map { it.toInt() }
    var p = 0
    for (i in s) {
        if (i < 100) {
            println("No")
            return
        }
        if (i > 675) {
            println("No")
            return
        }
        if (i % 25 != 0) {
            println("No")
            return
        }
        if (p > i) {
            println("No")
            return
        }
        p = i
    }
    println("Yes")
}
