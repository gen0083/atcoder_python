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
    let mut row: Vec<u64> = cards.iter().map(|v| v.0).unique().collect();
    let mut col: Vec<u64> = cards.iter().map(|v| v.1).collect();
    row.sort();
    col.sort();
    for c in cards {
        let r = row.iter().position(|&x| x == c.0).unwrap() + 1;
        let c = col.iter().position(|&x| x == c.1).unwrap() + 1;
        println!("{} {}", r, c);
    }
}
