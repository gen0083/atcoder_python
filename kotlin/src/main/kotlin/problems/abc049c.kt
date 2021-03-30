fun main() {
    abc049c()
}

fun abc049c() {
    val s = readLine()!!
    if (s.replace("eraser", "")
            .replace("erase", "")
            .replace("dreamer", "")
            .replace("dream", "") != "") {
        println("NO")
    } else {
        println("YES")
    }
}