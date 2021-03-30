import java.util.*

//

fun main() {
    abc167c()
}

fun abc167c() {
    val (n, m, x) = readLine()!!.split(" ").map { it.toInt() }
    val books = mutableListOf<Book>()
    val sc = Scanner(System.`in`)
    for (i in 0 until n) {
        val c = sc.nextInt()
        val e = mutableListOf<Int>()
        for (j in 0 until m) {
            e.add(sc.nextInt())
        }
        books.add(Book(c, e))
    }
    val cost = 1000000
    val pattern = mutableListOf<Book>()
    val emptyBook = Book(0, List<Int>(m) { 0 })
    generatePattern(books, pattern, emptyBook, 0, x)
    if (pattern.isEmpty()) {
        println("-1")
    } else {
        val min = pattern.minBy { it.cost }
        println(min!!.cost)
    }
}

private fun generatePattern(data: List<Book>, result: MutableList<Book>, current: Book,
    num: Int, x: Int) {
    if (num == data.size) {
        val ng = current.experience.filter { it < x }
        if (ng.isEmpty()) {
            result.add(current)
        }
    } else {
        generatePattern(data, result, current, num + 1, x)
        val t = data[num]
        val e = current.experience.mapIndexed { index, i -> t.experience[index] + i }
        generatePattern(data, result, Book(t.cost + current.cost, e), num + 1, x)
    }
}

data class Book(
    val cost: Int,
    val experience: List<Int>
)