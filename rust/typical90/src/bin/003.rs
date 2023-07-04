use std::collections::VecDeque;
use proconio::input;

fn main() {
    input! {
         n: usize,
    }
    let mut roads = vec![vec![]; n + 1];
    for _ in 0..n - 1 {
        input! {
            a:usize,
            b:usize,
        }
        roads[a].push(b);
        roads[b].push(a);
    }
    let (last, _) = search(1, &roads);
    let (_, depth) = search(last, &roads);
    println!("{}", depth + 1);
}

fn search(start: usize, roads: &Vec<Vec<usize>>) -> (usize, i32) {
    let mut stack = VecDeque::<usize>::new();
    let mut visited = vec![false; roads.len()];
    let mut last = 0_usize;
    let mut depth = 0;
    visited[start] = true;
    for r in roads[start].iter() {
        stack.push_back(*r);
    }
    while !stack.is_empty() {
        let size = stack.len();
        for _ in 0..size {
            let from = stack.pop_front().unwrap();
            if visited[from] {
                continue;
            }
            visited[from] = true;
            last = from;
            for r in roads[from].iter() {
                if !visited[*r] {
                    stack.push_back(*r);
                }
            }
        }
        depth += 1;
    }
    return (last, depth);
}
