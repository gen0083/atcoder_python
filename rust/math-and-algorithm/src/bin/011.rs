use std::vec;

use itertools::Itertools;
use proconio::input;

fn main() {
    input! {
        n: usize,
    }
    let mut a = vec![];
    let mut b = vec![false; n + 1];
    for i in 2..=n {
        if !b[i] {
            b[i] = true;
            a.push(i);
            for j in 1..(n/i + 1) {
                b[i * j] = true;
            } 
        }
    }
    println!("{}", a.iter().map(|i| i.to_string()).join(" "));
}
