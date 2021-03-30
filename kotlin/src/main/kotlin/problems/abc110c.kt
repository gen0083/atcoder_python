// https://atcoder.jp/contests/abc110/tasks/abc110_c

fun main() {
    abc110c()
}

fun abc110c() {
    val s = readLine()!!
    val t = readLine()!!
    val current = s.groupingBy { it }.eachCount()
    val target = t.groupingBy { it }.eachCount()
    if (current.size != target.size) {
        println("No")
        return
    }
    val cv = current.values.sorted()
    val tv = target.values.sorted()
    for (i in cv.indices) {
        if (cv[i] != tv[i]) {
            println("No")
            return
        }
    }
    println("Yes")
}