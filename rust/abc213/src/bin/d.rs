use std::{
    cmp::Reverse,
    collections::{BinaryHeap, HashSet},
};

use itertools::Itertools;
use proconio::input;

fn main() {
    input! {
        n: usize,
        roads: [(usize, usize); n - 1]
    }
    let mut nodes: Vec<BinaryHeap<_>> = vec![BinaryHeap::new(); n];
    for (a, b) in roads {
        nodes[a - 1].push(Reverse(b - 1));
        nodes[b - 1].push(Reverse(a - 1));
    }
    let mut stack = vec![];
    let mut current = 0usize;
    let mut hist = vec![0];
    let mut visited = HashSet::<usize>::new();
    visited.insert(current);
    loop {
        while let Some(next) = nodes[current].pop() {
            if !visited.contains(&next.0) {
                stack.push(current);
                hist.push(next.0);
                visited.insert(next.0);
                current = next.0;
            }
        }
        match stack.pop() {
            None => break,
            Some(v) => {
                current = v;
                hist.push(current);
            }
        }
    }
    println!("{}", hist.iter().map(|i| (i + 1).to_string()).join(" "));
}
