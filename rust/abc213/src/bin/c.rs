use std::{collections::HashSet, ops::Index};

use itertools::Itertools;
use proconio::input;

fn main() {
    input!{
        h: u64,
        w: u64,
        n: usize,
        cards: [(u64, u64); n]
    }
    let mut row = cards.iter().map(|v| v.0).unique().collect_vec();
    let mut col = cards.iter().map(|v| v.1).unique().collect_vec();
    row.sort();
    col.sort();
    for (a, b) in cards {
        let c = row.binary_search(&a).unwrap() + 1;
        let d = col.binary_search(&b).unwrap() + 1;
        println!("{} {}", c, d);
    }
}