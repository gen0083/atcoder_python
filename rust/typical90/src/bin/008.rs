use std::collections::HashMap;

use proconio::{input, marker::Chars};

fn main() {
    input! {
        n: usize,
        s: Chars,
    }
    let m = 1000000007;
    let t: HashMap<char, usize> = "atcoder".chars().enumerate().map(|(i, c)| (c, i)).collect();
    let mut dp = vec![vec![0; 7]; n + 1];
    for (i, c) in s.iter().enumerate() {
        for j in 0..7 {
            dp[i + 1][j] = dp[i][j];
        }
        if let Some(&ci) = t.get(c) {
            if ci == 0 {
                dp[i + 1][ci] += 1;
            } else {
                dp[i + 1][ci] += dp[i][ci - 1];
            }
            dp[i + 1][ci] %= m;
        }
    }
    println!("{}", dp[n][6]);
}
