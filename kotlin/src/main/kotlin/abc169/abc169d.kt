import kotlin.math.sqrt

//

fun main() {
    abc169d()
}

fun abc169d() {
    val n = readLine()!!.toLong()
    //    var count = 0
    //    var N = n
    //    var p = 2.0
    //    var e = 1.0
    //    var z = pow(p, e).toLong()
    //    val memo = mutableSetOf<Long>()
    //    while (N % z == 0L && N > 1L) {
    //        N /= z
    //        memo.add(z)
    //        count++
    //        e++
    //        z = pow(p, e).toLong()
    //    }
    //    p = 3.0
    //    e = 1.0
    //    z = pow(p, e).toLong()
    //    while (N > 1L) {
    //        while (N % z == 0L) {
    //            N /= z
    //            memo.add(z)
    //            count++
    //            e++
    //            z = pow(p, e).toLong()
    //        }
    //        p += 2L
    //        while (p.toLong() in memo) {
    //            p += 2
    //        }
    //    }
    //    println(count)
    var count = 0
    var N = n
    val memo = mutableSetOf<Long>()
    for (i in 2L..sqrt(n.toDouble()).toLong() + 1) {
        if (N % i == 0L) {
            count++
            N /= i
            memo.add(i)
        }
        if (N == 1L) break
    }
    if (N == 1L) {
        println(count)
    } else {
        for (i in memo) {
            if (N % i == 0L) {
                println(count)
                return
            }
        }
        println(count + 1)
    }
}
