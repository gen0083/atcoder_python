// https://atcoder.jp/contests/abc127/tasks/abc127_d

import java.util.*

fun main(args: Array<String>) {
    abc127d()
}

fun abc127d() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val heap = PriorityQueue<Long>()
    var total = 0L
    readLine()!!.split(" ").map { it.toLong() }.forEach {
        heap.add(it)
        total += it
    }
    val operation = mutableListOf<Pair<Int, Long>>()
    repeat(m) {
        val (b, c) = readLine()!!.split(" ").map { it.toLong() }
        operation.add(b.toInt() to c)
    }
    // 例えば3に書き換える操作で3に変えたカードをあとから10に書き換えるのは無駄な操作になる
    // したがって操作によって変更される値は降順にならべて、大きい数値への変更から処理していくのが最適になる
    operation.sortByDescending { it.second }
    for ((i, v) in operation) {
        if (heap.isEmpty()) break
        if (heap.peek() > v) break
        repeat(i) {
            if (heap.isNotEmpty() && heap.peek() < v) {
                val origin = heap.poll()
                total += v - origin
            } else {
                return@repeat
            }
        }
    }
    println(total)
}
