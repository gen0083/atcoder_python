fun main(args: Array<String>) {
    abc051c()
}

fun abc051c() {
    val (sx, sy, tx, ty) = readLine()!!.split(" ").map { it.toInt() }
    // 目標地点の座標のうちxもしくはyが1つ手前になるまで右上に向かって移動
    // のこりは足りない分を移動する
    // こうすることで最短往路を求めることができる
    // 最短往路の最初と最後を除いて反転して操作を逆転させると、最短の復路が求まる
    // あとはその経路を1マス外側でもう一度移動することで同じマスを通らず最短距離での往復がもう1度できる
    val move_to = buildString {
        var x = sx
        var y = sy
        while (x < tx - 1 && y < ty - 1) {
            append("U")
            append("R")
            x++
            y++
        }
        append("U".repeat(ty - y))
        append("R".repeat(tx - x))
    }
    val return_to = buildString {
        append("D")
        append(move_to.substring(1, move_to.lastIndex).reversed()
            .replace("U", "D").replace("R", "L"))
        append("L")
    }
    println("${move_to}${return_to}LU${move_to}RDRD${return_to}LU")
}