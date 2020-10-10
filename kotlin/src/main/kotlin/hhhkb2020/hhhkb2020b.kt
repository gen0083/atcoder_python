//

fun main() {
    hhhkb2020b()
}

fun hhhkb2020b() {
    val (h, w) = readLine()!!.split(" ").map { it.toInt() }
    val room = mutableListOf<String>()
    repeat(h) {
        val s = readLine()!!
        room.add(s)
    }
    var count = 0
    for (i in 0 until h) {
        var j = 0
        var isCheck = false
        while (j < w) {
            if (isCheck) {
                if (room[i][j] == '.') {
                    count++
                } else {
                    isCheck = false
                }
            } else {
                isCheck = room[i][j] == '.'
            }
            j++
        }
    }
    for (i in 0 until w) {
        var j = 0
        var isCheck = false
        while (j < h) {
            if (isCheck) {
                if (room[j][i] == '.') {
                    count++
                } else {
                    isCheck = false
                }
            } else {
                isCheck = room[j][i] == '.'
            }
            j++
        }
    }
    println(count)
}
