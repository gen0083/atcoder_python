import java.lang.Long.max
import java.lang.Long.min

//

fun main() {
    hhhkb2020d()
}

fun hhhkb2020d() {
    val t = readLine()!!.toInt()
    val BASE_NUM = (1e9 + 7).toLong()
    repeat(t) {
        val (n, a, b) = readLine()!!.split(" ").map { it.toLong() }
        val x = max(a, b)
        val y = min(a, b)
        val patternA = (n - x + 1L) * (n - x + 1L) % BASE_NUM
        val patternB = (n - y + 1L) * (n - y + 1L) % BASE_NUM
        // A/Bのうちいずれかが1の場合はこれでOK
        // どちらも2以上の場合はこれではダメ、一部重複も重なった状態なので除外しなければならない
        // そして一部重複は配置された場所によって重複するパターンが異なる
        val dup = ((x - y + 1L) * (x - y + 1L) % BASE_NUM) * patternA % BASE_NUM
        val pattern = ((patternA * patternB % BASE_NUM) - dup) % BASE_NUM
        println(pattern)
    }
}
