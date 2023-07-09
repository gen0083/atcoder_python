use proconio::input;
use std::collections::VecDeque;

fn main() {
    input! {
        n1: usize,
        n2: usize,
        m: usize,
    }
    let mut roads = vec![vec![0_usize]; n1 + n2 + 1];
    for _ in 0..m {
        input! {
            a: usize,
            b: usize,
        }
        roads[a].push(b);
        roads[b].push(a);
    }
    let d1 = traverse(1, &roads);
    let d2 = traverse(n1 + n2, &roads);
    println!("{}", d1 + d2 + 1);
}

fn traverse(start: usize, roads: &Vec<Vec<usize>>) -> i32 {
    let mut d = vec![-1; roads.len()];
    let mut next: VecDeque<usize> = VecDeque::new();
    next.push_back(start);
    d[start] = 0;
    // 空になったらNoneが返ってきてループ終了になる
    while let Some(from) = next.pop_front() {
        for &to in roads[from].iter() {
            if d[to] == -1 {
                next.push_back(to);
                d[to] = d[from] + 1;
            }
        }
    }
    return *d.iter().max().unwrap();
}
