//

fun main() {
    arc019b()
}

fun arc019b() {
    val a = readLine()!!
    val center = a.length / 2
    val isEven = a.length % 2 == 0
    // デフォルト名がもともと回文か確認する
    var inhibitor = 0
    for (i in 0 until center) {
        val r = if (isEven) center + i else center + 1 + i
        val l = center - 1 - i
        if (a[r] != a[l]) {
            inhibitor++
        }
    }
    val isPalindrome = inhibitor == 0
    var count = 0L
    // 中央の変化の可能性（奇数のみ）
    // もともと回文でないのならば、中央の文字は現在の文字以外に変化させることが可能
    // 回文であれば中央の文字を変えても回文のままなので、回文でない名前にならない
    if (!isEven && !isPalindrome) count += 25L
    var r = if (isEven) center else center + 1
    var l = center - 1
    while (l >= 0) {
        if (a[r] == a[l]) {
            // 対応する位置の文字が同じなら、26文字のアルファベットのうち他の25文字に変えたら回文ではなくなる
            // それが両辺ごとなので25 * 2の変更するパターンが存在する
            count += 50L
        } else {
            // デフォルトの名前を回文たらしめていない要素がただ1つのみであれば、
            // その文字を相手先の文字に変更することはできない
            // 回文たらしてめていない要素が複数あるのであれば、回文判定で対応する位置の文字に変更しても回文にはならない
            // よって阻害要因が1つのみの場合のみ24*2パターンになり、それ以外は25*2になる
            count += if (inhibitor == 1) 48L else 50L
        }
        r++
        l--
    }
    println(count)
}