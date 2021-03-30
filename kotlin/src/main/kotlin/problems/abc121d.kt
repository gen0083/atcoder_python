import java.util.*

// https://atcoder.jp/contests/abc121/tasks/abc121_d

fun main() {
    abc121d()
}

fun abc121d() {
    val (a, b) = readLine()!!.split(" ").map { it.toLong() }
    // とりあえず40ビットあれば10^12までの数値は収まるらしい
    //    searchBitArea(a)
    //    searchBitArea(b)
    // a..bで1つずつxorをとるのは当然NG（最悪の計算量がA=0〜B=10^12で10^12オーダーになるので間に合うわけがない）
    // 考えても分からんので解説見た
    // A,A+1,A+2,...,Bと考えると、非常にやりにくい（変化する範囲が途中で止まってしまうので、単純に考えられない）
    // したがってこれを0~Aのように変形できると非常に考えやすくなる
    // そのために利用するのが、n xor nは0になるという性質と、
    // 排他的論理和なので、各ビットの位置において何個ビットが立っているかだけが結果に影響する＝計算順序を入れ替えても影響がないことを利用して
    // 0~A-1 xor 0~Bとして考える　こうするとどちらにも0~A-1までの排他的論理和が現れるが、2つ出てくるということは
    // n xor n = 0のため、0~A-1 xor 0~Bを考えれば、その結果はA~Bと一緒ということになる
    // [たしかに0から考えることができたら楽なのになぁというのは思ってはいたが、ここまでは思い至らなかった]
    val from0toA = fromZeroToN(a - 1)
    val from0toB = fromZeroToN(b)
    println(from0toA.xor(from0toB))
}

private fun fromZeroToN(n: Long): Long {
    // n と n+1のxorは1になるので計算を省略できる
    if (n <= 0L) return 0L
    return if (n % 2 == 1L) {
        (n + 1) / 2 % 2
    } else {
        n.xor(n / 2 % 2)
    }
}

private fun searchBitArea(a: Long) {
    var n = a
    val bits = ArrayDeque<Int>()
    while (n > 0) {
        bits.addFirst((n % 2).toInt())
        n /= 2
    }
    println("$a = length:${bits.size}")
    println(bits.joinToString(" "))
}