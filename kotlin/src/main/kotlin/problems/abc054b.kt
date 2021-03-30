fun main(args: Array<String>) {
    abc054b()
}

fun abc054b() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val image = Array<String>(n) { "" }
    val template = Array<String>(m) { "" }
    repeat(n) { image[it] = readLine()!! }
    repeat(m) { template[it] = readLine()!! }
    for (i in 0..n - m) {
        for (j in 0..n - m) {
            var h = 0
            var w = 0
            var count = 0
            while (image[i + h][j + w] == template[h][w]) {
                count++
                w++
                if (w == m) {
                    w = 0
                    h++
                    if (h == m) {
                        break
                    }
                }
            }
            if (count == m * m) {
                println("Yes")
                return
            }
        }
    }
    println("No")
}