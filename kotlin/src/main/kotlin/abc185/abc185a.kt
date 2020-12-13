import java.lang.Integer.min

//

fun main() {
    abc185a()
}

fun abc185a() {
    val (a, b, c, d) = readLine()!!.split(" ").map { it.toInt() }
    println(min(a, min(b, min(c, d))))
}
