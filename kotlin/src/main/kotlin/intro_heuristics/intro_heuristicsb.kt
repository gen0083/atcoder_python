//

fun main() {
    intro_heuristicsb()
}

fun intro_heuristicsb() {
    val d = readLine()!!.toInt()
    val c = readLine()!!.split(" ").map { it.toInt() }
    val s = MutableList(d) { listOf<Int>() }
    repeat(d) {
        s[it] = readLine()!!.split(" ").map { it.toInt() }
    }
    var score = 0
    val last = IntArray(26) { 0 }
    val contests = mutableListOf<Int>()
    repeat(d) {
        val contest = readLine()!!.toInt()
        contests.add(contest)
    }
    computeScore(contests, s, c)
}

private fun computeScore(selected: List<Int>, s: List<List<Int>>, c: List<Int>): Int {
    var score = 0
    val last = IntArray(26) { 0 }
    for (i in selected.indices) {
        val contest = selected[i]
        val day = i + 1
        score += s[i][contest - 1]
        last[contest - 1] = day
        score -= last.mapIndexed { index, i -> (day - i) * c[index] }.sum()
        println(score)
    }
    return score
}