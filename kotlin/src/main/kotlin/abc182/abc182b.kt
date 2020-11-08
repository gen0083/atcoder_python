//

fun main() {
    abc182b()
}

fun abc182b() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    var maxCount = 0
    var gcd = 1
    for (i in 2..1000) {
        var count = 0
        for (j in a) {
            if (j % i == 0) count++
        }
        if (count > maxCount) {
            maxCount = count
            gcd = i
        }
    }
    println(gcd)
}
