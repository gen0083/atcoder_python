use std::cmp::max;

use proconio::input;

fn main() {
    input!{
        n: usize,
        paths: [(usize, usize, u64); n - 1]
    }
    let mut ans = paths.iter().fold(0, |acc, t| acc + t.2);
    let mut tmp: Vec<u64> = paths.into_iter().map(|t| t.2).collect();
    for i in 0..n-1 {
        let mut p: Vec<u64> = vec![];
        for j in 0..tmp.len()-1 {
            let m = max(tmp[j], tmp[j+1]);
            ans += m;
            p.push(m);
        }
        tmp = p;
    }
    println!("{}", ans);
}
