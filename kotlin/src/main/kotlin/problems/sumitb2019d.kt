fun main(args: Array<String>) {
    sumitb2019d()
}

fun sumitb2019d() {
    val n = readLine()!!.toInt()
    val s = readLine()!!
    val topArray = java.util.HashMap<Char, MutableSet<Char>>()
    val candidate = mutableSetOf<String>()
    for (c in s) {
        for (p in topArray) {
            for (e in p.value) {
                candidate.add("${p.key}$e$c")
            }
            p.value.add(c)
        }
        if (c !in topArray) topArray[c] = mutableSetOf<Char>()
    }
    println(candidate.size)
}