//

fun main() {
    hhhkb2020c()
}

fun hhhkb2020c() {
    val n = readLine()!!.toInt()
    val p = readLine()!!.split(" ").map { it.toInt() }
    var pointer = 0
    val appear = IntArray(200001) { 0 }
    for (i in p) {
        appear[i]++
        while (appear[pointer] != 0) {
            pointer++
        }
        println(pointer)
    }
}
