//

fun main() {
    abc167b()
}

fun abc167b() {
    val (a, b, c, k) = readLine()!!.split(" ").map { it.toLong() }
    when {
        // KがAより小さいパターンが考慮漏れだった・・・
        k < a      -> println(k)
        k <= a + b -> println(a)
        
        else       -> {
            val d = k - a - b
            println(a - d)
        }
    }
}
