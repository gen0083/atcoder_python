//

fun main() {
    abc181d()
}

fun abc181d() {
    val s = readLine()!!
    val list = s.groupingBy { it }.eachCount()
    var c159 = list.getOrDefault('1', 0) + list.getOrDefault('5', 0) + list.getOrDefault('9', 0)
    var c37 = list.getOrDefault('3', 0) + list.getOrDefault('7', 0)
    var c48 = list.getOrDefault('4', 0) + list.getOrDefault('8', 0)
    var c26 = list.getOrDefault('2', 0) + list.getOrDefault('6', 0)
    var c2 = list.getOrDefault('2', 0)
    var c6 = list.getOrDefault('6', 0)
    if (c48 + c26 == 0) {
        println("No")
        return
    }
    if (c159 + c37 == 0) {
        println("Yes")
    } else {
        // 2と6はかならず13579がないと消費できない
        if (c159 + c37 < c26) {
            println("No")
        } else {
        
        }
    }
}
