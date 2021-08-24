use std::iter::FromIterator;

use itertools::Itertools;
use proconio::marker::Chars;
use proconio::input;

fn main() {
    input!{
        mut s: Chars,
        k: usize,
    }
    s.sort();
    let n = s.len();
    let pat = s.into_iter().permutations(n).unique().collect_vec();
    let ans = String::from_iter(pat[k - 1].iter());
    println!("{}", ans);
}
