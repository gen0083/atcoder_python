use std::collections::VecDeque;

use proconio::input;

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
    let d2 = traverse(n1+n2, &roads);
    println!("{}", d1 + d2 + 1);
}

// 考え方はあってるんだけど、実装方法が違うのか・・・
// step数ではなく、startからの最短距離を計算しなければならなかったのが敗因か
// だいたい近しいんだけど、ダイクストラちっくにstartから各頂点への最短距離を計算しなければならなかった
fn traverse(start: usize ,roads: &Vec<Vec<usize>>) -> i32 {
    let mut f = vec![false; roads.len() + 1];
    let mut d = 0;
    let mut next: VecDeque<usize> = VecDeque::new();
    next.push_back(start);
    f[start] = true;
    while !next.is_empty() {
        let c = next.len();
        let mut is_run = false;
        for _ in 0..c {
            let from = next.pop_front().unwrap();
            for to in roads[from].iter() {
                if !f[*to] {
                    next.push_back(*to);
                    f[*to] = true;
                    is_run = true;
                }
            }
        }
        if is_run {
            d += 1;
        }
    }
    return d;
}