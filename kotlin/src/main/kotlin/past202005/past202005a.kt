//

fun main() {
    past202005a()
}

fun past202005a() {
    val a = readLine()!!
    val b = readLine()!!
    if (a == b) {
        println("same")
    } else if (a.toLowerCase() == b.toLowerCase()) {
        println("case-insensitive\n")
    } else {
        println("different")
    }
}
