use std::cmp::Reverse;

use itertools::Itertools;
use proconio::input;

fn main() {
    input! {
        n: usize,
        mut a: [i64; n]
    }
    let mut b: Vec<(usize, &i64)> = a.iter().enumerate().map(|p| (p.0 + 1, p.1)).collect_vec();
    b.sort_by_key(|v| Reverse(v.1));
    println!("{}", b[1].0);
}
