//

fun main() {
    arc107a()
}

fun arc107a() {
    val (a, b, c) = readLine()!!.split(" ").map { it.toLong() }
    // なんというか、カンでというか、こういうパターン使うしかねえんじゃねっていう当てずっぽうで当てただけである・・・
    val base = 998244353
    val aa = (1 + a) * a / 2L % base
    val bb = (1 + b) * b / 2L % base
    val cc = (1 + c) * c / 2L % base
    var ans = aa * bb % base
    ans = ans * cc % base
    println(ans)
}
