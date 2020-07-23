//

fun main() {
    agc019b()
}

fun agc019b() {
    val a = readLine()!!
    val n = a.length - 1
    var count = (n + 1) * n / 2 + 1
    var p = ' '
    var t = 0
    val s = mutableMapOf<Char, Int>()
    for (i in 0 until 26) {
        s[('a' + i).toChar()] = -1
    }
    // 同じ文字の連続するパターンをカウント
    for (i in 0..n) {
        if (a[i] == p) {
            t++
            count -= t
        } else {
            t = 0
            // 同じ文字に囲まれた偶数区間
            if (s.getOrDefault(a[i], -1) >= 0) {
                val sand = i - s[a[i]]!! - 1
                if (sand % 2 == 0) {
                    count -= (sand / 2)
                    //                    count -= 1
                }
            }
            s[a[i]] = i
        }
        p = a[i]
    }
    // ある文字を基準に左右対称となる部分文字列のパターンをカウント
    for (i in 0..n) {
        t = 1
        p = a[i]
        var sameChar = true
        while (i - t >= 0 && i + t <= n) {
            if (a[i - t] != a[i + t]) break
            if (sameChar && a[i + t] == p) {
                // 連続する同じ文字列で左右対称はすでにカウントしているのでカウントしない
            } else {
                count--
                sameChar = false
            }
            t++
        }
    }
    println(count)
}