use std::iter::FromIterator;

use itertools::Itertools;
use proconio::input;

fn main() {
    input! {
        n: usize,
        q: usize,
    }
    let mut a = Vec::from_iter(1..n + 1);
    let mut b = Vec::from_iter(0..n);
    for i in 0..q {
        input! {mut x: usize,}
        let mut s = &b[x - 1];
        if *s == n - 1 {
            s = &(n - 2);
        }
        a.swap(*s, *s+1)
    }

    println!("{}", a.iter().map(|x| x.to_string()).join(" "));
}
