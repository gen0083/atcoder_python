fun main(args: Array<String>) {
    paizab103()
}

fun paizab103() {
    val n = readLine()!!.toInt()
    var (xr, xg, xb) = readLine()!!.split(" ").map { it.toInt() }
    repeat(n) {
        val (axis, color) = readLine()!!.split(" ")
        val move = if (axis == "L") -1 else 1
        if (color in listOf("R", "Y", "M", "W")) {
            xr += move
        }
        if (color in listOf("G", "Y", "C", "W")) {
            xg += move
        }
        if (color in listOf("B", "M", "C", "W")) {
            xb += move
        }
        if (xr == xg && xr == xb) {
            println(xr)
            return
        }
    }
    println("no")
}