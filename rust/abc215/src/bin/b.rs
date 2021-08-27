use proconio::input;

fn main() {
    input!{
        n: u64
    }
    // floatだと576460752303423487_f64が58になるべきところを59になってしまうのでWA
    // さらに精度を高めればこの条件下でもいけるらしいが
    // そもそも整数が求められるところに浮動小数点を使うのは筋が悪いという話
    // println!("{}", n.log2() as i64);
    let mut k = 0;
    let mut i = 1u64;
    while i <= n {
        i *= 2;
        k += 1;
    }
    println!("{}", k - 1);
}
