// https://atcoder.jp/contests/diverta2019/tasks/diverta2019_c
// TODO: refactoring この手の場合わけ苦手にしてるからリファクタリングを兼ねて整理して考える力を鍛えるべし

import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

fun main() {
    diverta2019c()
}

fun diverta2019c() {
    val n = readLine()!!.toInt()
    var bxx = 0
    var xxa = 0
    var bxxa = 0
    var count = 0
    repeat(n) {
        val s = readLine()!!
        count += "AB".toRegex().findAll(s).count()
        when {
            s.first() == 'B' && s.last() == 'A' -> bxxa++
            s.first() == 'B'                    -> bxx++
            s.last() == 'A'                     -> xxa++
        }
    }
    if (bxxa == 0) {
        // どっちかしかないなら少ない方分しかペアを作れない
        count += min(bxx, xxa)
    } else if (bxx == 0 && xxa == 0) {
        // bxxaしかないならbxxaの数-1個ペアが作れる（自身のBもしくはAが1つ無駄になって使えないから）
        count += bxxa - 1
    } else {
        // bxxaはどっちにも使えるからややこしい
        if (xxa >= bxx + bxxa) {
            // bxxaをbで始まるものとして扱うとしてもなおAで終わるものの数が多いのであれば、
            // Bで始まるものの個数だけABを作れる
            count += bxx + bxxa
        } else if (bxxa + xxa < bxx) {
            // bxxaをaで終わるものとして扱うとしてもなおBで始まるものの数が多いのであれば
            // Bで始まるものの個数分だけABを作れる
            count += bxxa + xxa
        } else {
            // bxxaが単独で余る場合、少ない方にbxxaを充足してやればbxxもしくはxxaの大きい方の個数だけABを作れる
            // あとは充足してもなお余ったbxxaの数 - 1個分だけABを作れるが、
            // 充足したbxxaを使ってもう1つペアを作れるので結局あまったbxxa分ペアを作れるということになる
            val bigger = max(bxx, xxa)
            count += bigger + bxxa - abs(bxx - xxa)
        }
    }
    println(count)
}