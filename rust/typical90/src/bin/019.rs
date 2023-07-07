use std::cmp::min;

use proconio::input;

fn main() {
    input! {
        n: usize,
        a: [i32; 2 * n],
    }
    let mut dp = vec![vec![i32::MAX; 2 * n + 1]; 2 * n + 1];
    // まず隣り合うところのコストを予め計算してしまう
    for i in 0..2 * n - 1 {
        dp[i + 1][i + 2] = (a[i] - a[i + 1]).abs();
    }
    for k in 1..n {
        for i in (1..2 * (n - k)) {
            let j = i + 2 * k + 1;
            dp[i][j] = min(dp[i][j], dp[i][i + 2 * k - 1] + dp[i + 2 * k][j]);
            dp[i][j] = min(dp[i][j], dp[i + 1][j - 1] + (a[i - 1] - a[j - 1]).abs());
        }
    }
    println!("{}", dp[1][2 * n]);
}
