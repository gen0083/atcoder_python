use std::cmp::min;

use proconio::input;

fn main() {
    input! {
        n: i64,
        A: i64,
        B: i64,
        C: i64,
    }
    let mut m = 9999_i64;
    for a in 0_i64..=9999 {
        let r = n - a * A;
        if r < 0 {
            continue;
        }
        for b in 0_i64..=9999-a {
            let c = (r - b * B) / C;
            if c >= 0 && r == b * B + c * C {
                m = min(m, a + b + c);
            }
        }
    }
    println!("{}", m);
}
