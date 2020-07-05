//

fun main() {
    abc173b()
}

fun abc173b() {
    val n = readLine()!!.toInt()
    val map = mutableMapOf("AC" to 0, "WA" to 0, "RE" to 0, "TLE" to 0)
    repeat(n) {
        val result = readLine()!!
        map[result] = map.getOrDefault(result, 0) + 1
    }
    println("AC x ${map["AC"]}")
    println("WA x ${map["WA"]}")
    println("TLE x ${map["TLE"]}")
    println("RE x ${map["RE"]}")
}
