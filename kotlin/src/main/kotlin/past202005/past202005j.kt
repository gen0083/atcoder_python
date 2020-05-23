import kotlin.math.max
import kotlin.math.min

fun main(args: Array<String>) {
    past202005j()
}

fun past202005j() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val maxTable = LongArray(n + 1) { 0L }
    var umai = 0L
    var mazui = 1_000_000_001L
    var lastSamurai = 1
    val sushi = readLine()!!.split(" ").map { it.toLong() }
    sushi.forEach { s ->
        if (s in umai..mazui) {
            // 最大でも最小でもないので、各人みにいってうまいが更新されてる人が食べる
            var noEat = true
            for (i in 1..n) {
                if (s > maxTable[i]) {
                    maxTable[i] = s
                    println(i)
                    noEat = false
                    break
                }
            }
            if (noEat) println(-1)
        } else {
            if (s > umai) {
                umai = s
                maxTable[1] = umai
                println(1)
                mazui = min(mazui, s)
            } else {
                mazui = s
                maxTable[lastSamurai] = s
                println(lastSamurai)
                lastSamurai++
                umai = max(umai, s)
            }
        }
    }
}