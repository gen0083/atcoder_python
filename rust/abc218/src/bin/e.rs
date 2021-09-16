use std::{
    collections::{BinaryHeap, HashSet},
    iter::FromIterator,
    num::ParseIntError,
    str::FromStr,
    string::ParseError,
};

use proconio::{derive_readable, input};

fn main() {
    input! {
        n: usize,
        m: usize,
        paths: [Path; m]
    }
    let mut heap: BinaryHeap<&Path> = BinaryHeap::new();
    let mut nodes = vec![vec![]; n + 1];
    let mut grp = HashSet::<usize>::new();
    let mut checked = HashSet::<usize>::new();
    for i in 0..m {
        let p: &Path = &paths[i];
        nodes[p.from].push(i);
        nodes[p.to].push(i);
    }
    for i in &nodes[1] {
        if !checked.contains(i) {
            checked.insert(*i);
            heap.push(&paths[*i]);
        }
    }
    grp.insert(1);
    let mut cost = 0;
    while !heap.is_empty() {
        match heap.pop() {
            Some(path) => {
                let next = if grp.contains(&path.from) && !grp.contains(&path.to) {
                    Some(path.to)
                } else if grp.contains(&path.to) && !grp.contains(&path.from) {
                    Some(path.from)
                } else {
                    if path.cost > 0 {
                        cost += path.cost;
                    }
                    None
                };
                if let Some(next) = next {
                    grp.insert(next);
                    for i in &nodes[next] {
                        if !checked.contains(i) {
                            checked.insert(*i);
                            heap.push(&paths[*i]);
                        }
                    }
                }
            }
            None => {
                break;
            }
        }
    }
    println!("{}", cost);
}

#[derive_readable]
#[derive(Debug, PartialEq, Eq)]
struct Path {
    from: usize,
    to: usize,
    cost: i64,
}

impl Ord for Path {
    fn cmp(&self, other: &Self) -> std::cmp::Ordering {
        other.cost.cmp(&self.cost)
    }
}

impl PartialOrd for Path {
    fn partial_cmp(&self, other: &Self) -> Option<std::cmp::Ordering> {
        Some(other.cost.cmp(&self.cost))
    }
}
