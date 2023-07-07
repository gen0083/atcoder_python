use std::vec;

use proconio::input;

fn main() {
    input! {
        h: usize,
        w: usize,
        a: [[i32; w]; h],
    }
    let mut r = vec![0; w];
    let mut c = vec![0; h];
    for i in 0..h {
        for j in 0..w {
            r[j] += a[i][j];
            c[i] += a[i][j];
        }
    }
    for i in 0..h {
        println!("{}", r.iter().enumerate().map(|(j, v)| (v + c[i] - a[i][j]).to_string()).collect::<Vec<_>>().join(" "));
    }
}
