use std::cmp::max;

use proconio::input;

fn main() {
    input! {
        n: u64,
    }
    let mut l = 2u64;
    let mut r = n;
    let mut t = n;
    let mut f = 1u64;
    while l < r {
        let x = n / l;
        if x > l {
            t += x;
        }
        let mut i = x;
        while i * l <= n {
            i += 1;
        }
        t += (r - i + 1) * f;
        f = l;
        r = i - 1;
        if l == r {t+= n / l;}
        l += 1;
    }
    println!("{}", t);
}
