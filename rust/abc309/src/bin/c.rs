use std::vec;

use proconio::input;

fn main() {
    input!{
        n: usize,
        k: i64,
        mut a: [(usize, i64); n],
    }
    a.sort();
    let mut now = 0_i64;
    for (d, q) in &a {
        now += q;
    }
    if now <= k {
        println!("1");
        return;
    }
    for (d, q) in &a {
        now -= q;
        if now <= k {
            print!("{}", 1+d);
            return;
        }
    }
}
