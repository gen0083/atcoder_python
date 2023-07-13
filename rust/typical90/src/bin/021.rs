use std::{vec, collections::VecDeque};

use proconio::{input, marker::Usize1};

fn main() {
    input! {
        n: usize,
        m: usize,
        r: [(Usize1, Usize1); m],
    }
    let mut reach = vec![vec![-1; n]; n];
    let mut roads: Vec<Vec<usize>> = vec![vec![]; m];
    for (from, to) in r {
        roads[from].push(to);
    }
    let mut count = 0;
    for i in 0..n {
        for j in i..n {
            let go = traverse(i, j, &mut reach, &roads);
            let back = traverse(i, j, &mut reach, &roads);
            if go && back {
                count += 1;
            }
        }
    }
    println!("{:?}", reach);
    println!("{:?}", count);
}

fn traverse(from: usize, to: usize, reach: &mut Vec<Vec<i32>>, roads: &Vec<Vec<usize>>) -> bool {
    if reach[from][to] != -1 {
        return reach[from][to] == to as i32;
    }
    let mut stack: VecDeque<usize> = VecDeque::new();
    stack.push_front(from);
    while let Some(next) = stack.pop_front() {
        reach[from][next] = next as i32;
        for &r in roads[next].iter() {
            if reach[from][r] == -1 {
                stack.push_front(r);
            }
        }
    }
    return reach[from][to] == to as i32;
}