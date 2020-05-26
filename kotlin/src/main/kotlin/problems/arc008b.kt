fun main(args: Array<String>) {
    arc008b()
}

fun arc008b() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val name = mutableMapOf<Char, Int>()
    readLine()!!.forEach { c ->
        name[c]?.let {
            name[c] = it + 1
        } ?: run { name[c] = 1 }
    }
    val kit = mutableMapOf<Char, Int>()
    readLine()!!.forEach { c ->
        kit[c]?.let {
            kit[c] = it + 1
        } ?: run { kit[c] = 1 }
    }
    // 1.1からならこう書ける
    // val name = readLine()!!.groupingBy { it }.eachCount()
    // val kit = readLine()!!.groupingBy { it }.eachCount()
    var count = 0
    name.keys.forEach { c ->
        
        if (c !in kit) {
            println("-1")
            return
        }
        count = Math.max(count, Math.ceil(name[c]!!.toDouble() / kit[c]!!.toDouble()).toInt())
    }
    println(count)
}