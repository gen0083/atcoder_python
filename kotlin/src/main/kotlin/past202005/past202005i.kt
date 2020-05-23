fun main(args: Array<String>) {
    past202005i()
}

fun past202005i() {
    val n = readLine()!!.toInt()
    val matrix = Array<LongArray>(n) { i -> LongArray(n) { j -> (n * i + j).toLong() } }
    val q = readLine()!!.toInt()
    var rev = false
    repeat(q) {
        val query = readLine()!!.split(" ")
        when (query[0]) {
            "1"  -> {
                // 行移動
                val a = query[1].toInt() - 1
                val b = query[2].toInt() - 1
                if (rev) {
                    swapColumn(matrix, a, b)
                } else {
                    swapRow(matrix, a, b)
                }
            }
            
            "2"  -> {
                // 列移動
                val a = query[1].toInt() - 1
                val b = query[2].toInt() - 1
                if (rev) {
                    swapRow(matrix, a, b)
                } else {
                    swapColumn(matrix, a, b)
                }
            }
            
            "3"  -> {
                // 行と列の入れ替え
                rev = !rev
            }
            
            else -> {
                val a = (if (rev) query[2].toInt() else query[1].toInt()) - 1
                val b = (if (rev) query[1].toInt() else query[2].toInt()) - 1
                println(matrix[a][b])
            }
        }
    }
}

private fun swapRow(matrix: Array<LongArray>, rowA: Int, rowB: Int) {
    for (i in 0 until matrix.size) {
        val t = matrix[rowA][i]
        matrix[rowA][i] = matrix[rowB][i]
        matrix[rowB][i] = t
    }
}

private fun swapColumn(matrix: Array<LongArray>, colA: Int, colB: Int) {
    for (i in 0 until matrix.size) {
        val t = matrix[i][colA]
        matrix[i][colA] = matrix[i][colB]
        matrix[i][colB] = t
    }
}