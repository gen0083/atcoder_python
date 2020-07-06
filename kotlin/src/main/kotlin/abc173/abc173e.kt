//

fun main() {
    abc173e()
}

private const val BASE_NUMBER = 1_000_000_007L

fun abc173e() {
    // 最大値を求める→　絶対値の大きい順に選ぶ　→　マイナスが奇数個の場合はマイナスが偶数個になるように選ぶ
    // どうあがいてもマイナスになる場合、逆に絶対値の小さい順に選ぶ
    // 全組み合わせを試す余裕はない
    var containMinus = false
    var containZero = false
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    val isOdd = k % 2 == 1
    val plusValue = mutableListOf<Long>()
    val minusValue = mutableListOf<Long>()
    for (l in readLine()!!.split(" ").map { it.toLong() }) {
        if (l == 0L) {
            containZero = true
        }
        if (l > 0L) {
            plusValue.add(l)
        } else {
            minusValue.add(l)
        }
    }
    if (containZero && plusValue.size + minusValue.size < k) {
        // ゼロを選ばざるを得ない場合は0になるので答えもゼロ
        println(0)
        return
    }
    var total = 0L
    val sortedPlus = plusValue.sortedDescending()
    val sortedMinus = minusValue.sorted()
    if (minusValue.isEmpty()) {
        // 負の値がない→plusの最大値からk個選べば良い
        total = sortedPlus[0]
        for (i in 1 until k) {
            total = total * sortedPlus[i] % BASE_NUMBER
        }
        println(total)
    } else if (plusValue.isEmpty()) {
        // 負の値しかない
        if (isOdd) {
            // マイナスしかなく奇数個選ばなければならないなら答えはマイナスになるので、絶対値が小さい順に選ぶ
            if (containZero) {
                // プラスの値がなく、0があるなら最大値は0になる(そうでなければマイナスの値にしかならないので)
                println(0)
                return
            }
            total = sortedMinus.last()
            val lastIndex = sortedMinus.lastIndex
            for (i in 1 until k) {
                total = total * sortedMinus[lastIndex - i] % BASE_NUMBER
            }
            println(if (total < 0) total + BASE_NUMBER else 0)
        } else {
            // kが偶数個なら絶対値の大きい順に選ぶのが最適
            total = sortedMinus[0]
            for (i in 1 until k) {
                total = total * sortedMinus[i] % BASE_NUMBER
            }
            println(total)
        }
    } else {
        // 最もややこしいケースで、とりあえず絶対値が大きい順に選んでみる
        // その結果、マイナスになるのであれば、最後に選んだマイナスとプラスの次点を入れ替える
        // プラスの次点がない場合はプラスの最小とマイナスの次点を入れ替える
        var p = 0
        var m = 0
        var plusTotal = 1L
        var minusTotal = 1L
        var prevPlus = 0L
        var prevMinus = 0L
        var sign = 1L
        if (k > sortedPlus.size && k % 2 == 1 && !containZero) {
            // どうしてもマイナスから値を選ばざるを得ず、かつ奇数個マイナスを選ぶことになる場合
        }
        for (i in 0 until k) {
            val plusValue = if (p < sortedPlus.size) sortedPlus[p] else 0L
            val minusValue = if (m < sortedMinus.size) sortedMinus[m] * -1 else 0L
            if (plusValue > minusValue) {
                prevPlus = plusTotal
                plusTotal = plusTotal * sortedPlus[p] % BASE_NUMBER
                p++
            } else {
                prevMinus = minusTotal
                minusTotal = minusTotal * minusValue % BASE_NUMBER
                sign *= -1L
                m++
            }
        }
        total = plusTotal * minusTotal * sign % BASE_NUMBER
        if (total < 0) {
            // 最後に使ったマイナスを次点のプラスに入れ替えるのと、最後のプラスを次点のマイナスに入れ替えるの2パターンが考えらる
            // つまり次点のそれぞれの値のうち、絶対値の大きい方を選ぶ
            if (sortedPlus.size + sortedMinus.size == k) {
                // そもそもどちらにも次点が存在しない場合はこれ以上変えようがない
                total += BASE_NUMBER
            } else {
                val nextPlus = if (p < sortedPlus.size) sortedPlus[p] else 0L
                val nextMinus = if (m < sortedMinus.size) sortedMinus[m] * -1 else 0L
                if (nextPlus > nextMinus) {
                    // 次点のプラスの方が大きい＝最後のマイナスの代わりに次点のプラスを使う
                    minusTotal = prevMinus
                    plusTotal = plusTotal * nextPlus % BASE_NUMBER
                } else {
                    // 次点のマイナスの方が大きい＝最後のプラスの代わりに次点のマイナスを使う
                    plusTotal = prevPlus
                    minusTotal = minusTotal * nextMinus % BASE_NUMBER
                }
                total = plusTotal * minusTotal % BASE_NUMBER
            }
        }
        println(total)
    }
}
