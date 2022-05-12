//

fun main() {
    intro_heuristicsa()
}

fun intro_heuristicsa() {
    val d = readLine()!!.toInt()
    val c = readLine()!!.split(" ").map { it.toInt() }
    val s = MutableList(d) { listOf<Int>() }
    repeat(d) {
        s[it] = readLine()!!.split(" ").map { it.toInt() }
    }
    val nextContest = (1..26).toMutableList()
    nextContest.shuffle()
    val minloss_last = IntArray(26) { 0 }
    val max_last = IntArray(26) { 0 }
    val max_pattern = mutableListOf<Int>()
    val minloss_pattern = mutableListOf<Int>()
    repeat(d) {
        val scores = s[it].mapIndexed { index, i -> index to i }
        val day = it + 1
        val minloss_disapoint =
            minloss_last.mapIndexed { index, i -> (it - i + 1) * c[index] }.sum()
        val minloss_score =
            scores.maxByOrNull { (index, value) -> value + (c[index] * (day - minloss_last[index])) - minloss_disapoint }!!
        minloss_pattern.add(minloss_score.first + 1)
        minloss_last[minloss_score.first] = day
        val max_score = scores.maxByOrNull { it.second }!!
        max_pattern.add(max_score.first + 1)
        max_last[max_score.first] = day
    }
    val max_score = computeScore(max_pattern, s, c)
    val minloss_score = computeScore(minloss_pattern, s, c)
    if (max_score > minloss_score) {
        max_pattern.forEach(::println)
    } else {
        minloss_pattern.forEach(::println)
    }
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
    }
    return score
}
