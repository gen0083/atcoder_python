use itertools::Itertools;
use proconio::input;
use std::cmp::max;
use std::collections::HashMap;

fn main() {
    input! {
        n: usize,
        k: usize,
        s: [String; n],
    }
    let mut m = 0usize;
    for i in 1..=n {
        for v in (0..n).combinations(i) {
            let mut d: HashMap<char, usize> = HashMap::new();
            for j in v {
                for c in s[j].chars() {
                    let count = d.entry(c).or_insert(0);
                    *count += 1;
                }
            }
            let b = d.values().filter(|&a| *a == k).count();
            m = max(m, b);
        }
    }
    println!("{}", m);
}
