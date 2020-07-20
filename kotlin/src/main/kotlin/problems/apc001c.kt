//

fun main() {
    apc001c()
}

fun apc001c() {
    val n = readLine()!!.toInt()
    val vacant = "Vacant"
    val male = "Male"
    val female = "Female"
    println(0)
    var searchTarget = readLine()!!
    if (searchTarget == vacant) {
        return
    }
    val leftSex = searchTarget
    // 0とn-1は必ず不一致
    println(n - 1)
    searchTarget = readLine()!!
    if (searchTarget == vacant) {
        return
    }
    val rightSex = searchTarget
    var left = 0
    var right = n - 1
    while (searchTarget != vacant || left + 1 < right) {
        val t = (left + right) / 2
        println(t)
        searchTarget = readLine()!!
        if (t % 2 == 0) {
            // tの性別をそのまま使う
            if (searchTarget == leftSex) {
                left = t
            } else {
                right = t
            }
        } else {
            // ベースが偶数なので奇数を調べるときは逆転させる
            val rev = if (searchTarget == male) female else male
            if (rev == leftSex) {
                left = t
            } else {
                right = t
            }
        }
    }
}