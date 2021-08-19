use std::collections::HashSet;

use itertools::Itertools;
use proconio::input;

fn main() {
    input! {
        n: usize,
        roads: [(usize, usize); n - 1]
    }
    let mut nodes: Vec<Vec<usize>> = vec![vec![]; n];
    for (a, b) in roads {
        nodes[a - 1].push(b - 1);
        nodes[b - 1].push(a - 1);
    }
    let mut stack = vec![];
    let mut current = 0usize;
    let mut hist = vec![0];
    let mut visited = HashSet::<usize>::new();
    visited.insert(current);
    loop {
        let mut nexts = nodes[current].clone();
        nexts.sort();
        let mut is_found = false;
        for next in nexts {
            if !visited.contains(&next) {
                is_found = true;
                stack.push(current);
                visited.insert(next);
                current = next;
                break;
            }
        }
        if !is_found {
            match stack.pop() {
                Some(c) => {
                    hist.push(current);
                    current = c;
                }
                None => {
                    break;
                }
            }
        }
        hist.push(current);
    }
    println!("{}", hist.iter().map(|i| (i + 1).to_string()).join(" "));
}
