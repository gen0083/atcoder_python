import kotlin.math.floor

//

fun main() {
    past202005f()
}

fun past202005f() {
    val n = readLine()!!.toInt()
    val matrix = mutableListOf<String>()
    repeat(n) {
        matrix.add(readLine()!!)
    }
    val isOdd = n % 2 == 1
    val half = floor(n / 2.0).toInt()
    var parindolome = ""
    for (i in 0 until half) {
        val firstLine = i
        val lastLine = n - 1 - i
        var notFound = true
        for (c in matrix[firstLine]) {
            if (matrix[lastLine].contains(c)) {
                notFound = false
                parindolome += c
                break
            }
        }
        if (notFound) {
            println(-1)
            return
        }
    }
    val result = buildString {
        append(parindolome)
        if (isOdd) {
            append(matrix[half][0])
        }
        append(parindolome.reversed())
    }
    println(result)
}
