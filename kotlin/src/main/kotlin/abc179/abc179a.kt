//

fun main() {
    abc179a()
}

fun abc179a() {
    val s = readLine()!!
    if (s.last() == 's') {
        println("${s}es")
    } else {
        println("${s}s")
    }
}
