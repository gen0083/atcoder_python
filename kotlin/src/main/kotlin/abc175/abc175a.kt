//

fun main() {
    abc175a()
}

fun abc175a() {
    val s = readLine()!!
    if (s == "RRR") {
        println(3)
    } else if (s == "RRS" || s == "SRR") {
        println(2)
    } else if (s.contains('R')) {
        println(1)
    } else {
        println(0)
    }
}
