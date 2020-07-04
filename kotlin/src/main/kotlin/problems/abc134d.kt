fun main() {
    abc134d()
}

fun abc134d() {
    val n = readLine()!!.toInt()
    // 各桁について、1ならiの倍数が奇数個になるようにするという意味
    val a = BooleanArray(n + 1) { false }
    for ((i, s) in readLine()!!.split(" ").withIndex()) {
        a[i + 1] = s == "1"
    }
    val ans = mutableSetOf<Int>()
    var i = n
    while (i * i < n) {
        if (a[i]) ans.add(i)
        i--
    }
    // n/2まではiの倍数は1つしかないので、a[i]から確定できる
    // nから1まで約数の個数を計算していって確定させていく方法をとったが、その方が計算量が増えたらしい
    while (i > 1) {
        val count = ans.count { it % i == 0 }
        if (count % 2 == 0) {
            if (a[i]) ans.add(i)
        } else {
            if (!a[i]) ans.add(i)
        }
        i--
    }
    if (a[1] && ans.size % 2 == 0) ans.add(1)
    println(ans.size)
    println(ans.joinToString(" "))
}