use std::collections::{HashSet, VecDeque};
use proconio::input;

fn main() {
    input!{
        n: usize,
        q: usize,
    }
    let mut road: Vec<Vec<usize>> = vec![vec![]; n + 1];
    let mut town = vec![-1; n + 1];
    for _ in 1..n {
        input! {
            a: usize,
            b: usize,
        }
        road[a].push(b);
        road[b].push(a);
    }
    let mut visited:HashSet<usize> = HashSet::new();
    let mut stack: VecDeque<usize> = VecDeque::new();
    stack.push_back(1);
    let mut group = 0;
    while !stack.is_empty() {
        let count = stack.len();
        for _ in 0..count {
            let t = stack.pop_front().unwrap();
            if  visited.contains(&t) {
                continue;
            }
            town[t] = group;
            stack.extend(road[t].iter());
            visited.insert(t);
        }
        group = (group + 1) % 2;
    }
    for _ in 0..q {
        input! {
            c: usize,
            d: usize,
        }
        if town[c] == town[d] {
            println!("Town");
        } else {
            println!("Road");
        }
    }
}
