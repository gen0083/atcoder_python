import java.util.*

fun main() {
    abc166b()
}

fun abc166b() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val set = mutableSetOf<Int>()
    for (i in 1..b) {
        val d = sc.nextInt()
        for (j in 1..d) {
            val e = sc.nextInt()
            set.add(e)
        }
    }
    println(a - set.size)
}