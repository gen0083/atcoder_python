fun main(args: Array<String>) {
    abc125d()
}

fun abc125d() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toLong() }
    // Kotlin1.0.0だとこのコードはコンパイルできない
    //    val abs = a.map { abs(it) }
    //    if (a.count { it < 0 } % 2 == 0) {
    //        println(abs.sum())
    //    } else {
    //        println(abs.sum() - abs.min()!! * 2)
    //    }
    val abs = a.map { if (it < 0) it * -1 else it }
    var min = abs.first()
    var sum = 0L
    abs.forEach {
        if (min > it) {
            min = it
        }
        sum += it
    }
    if (a.count { it < 0 } % 2 == 0) {
        println(sum)
    } else {
        println(sum - min * 2)
    }
}