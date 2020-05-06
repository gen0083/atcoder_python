fun main() {
    abc166e()
}

fun abc166e() {
    val n = readLine()!!.toInt()
    val height = readLine()!!.split(" ").map { it.toInt() }
    val m = height.withIndex().map { (i, e) -> i to e - i }
    var count = 0
    //    for (i in 0 until n) {
    //        var sa = height[i]
    //        while(i + sa < n) {
    //            if (height[i] + height[i + sa] == sa) {
    //                count++
    //            }
    //            sa++
    //        }
    //    }
    m.filter { it.second < 0 }.forEach { (i, e) ->
        count += m.count { it.second == -e }
    }
    println(count)
}