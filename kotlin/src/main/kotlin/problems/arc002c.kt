fun main(args: Array<String>) {
    arc002c()
}

fun arc002c() {
    val n = readLine()!!.toInt()
    val c = readLine()!!
    val pattern = listOf<String>(
        "AA", "AB", "AX", "AY",
        "BA", "BB", "BX", "BY",
        "XA", "XB", "XX", "XY",
        "YA", "YB", "YX", "YY"
    )
    val first = pattern.map {
        c.replace(it, "L")
    }.toSet()
    
    val second = mutableListOf<String>()
    var finally_min = n
    first.flatMapTo(second) { target ->
        pattern.map {
            val result = target.replace(it, "R")
            if (finally_min > result.length) finally_min = result.length
            result
        }
    }
    // Comparator {}は1.1から
    // val finally_min = second.minWith(Comparator { o1, o2 -> o1.length - o2.length })!!
    println(finally_min)
    // これで通ったけど、解説見ると間違ったやり方らしい
    // が、DPでの解き方と何が違うのかがよくわからん・・・
    // ABABBABAのパターンで先にABで置き換えてしまうとだめになるということだが、
    // BAで先に置き換えてその次にABで置き換えれば最適解が求まるので問題ないのではと思うのだが・・・
}