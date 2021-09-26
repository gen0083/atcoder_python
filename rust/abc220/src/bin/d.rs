use proconio::input;

fn main() {
    input!{
        n: usize,
        a: [usize; n]
    }
    let m = 998244353usize;
    let mut dp: Vec<Vec<usize>> = vec![vec![0; 10]; n + 1];
    dp[1][a[0]] = 1;
    for i in 2..=n {
        for j in 0..10 {
            if dp[i - 1][j] == 0 { continue; }
            let f = (a[i - 1] + j) % 10;
            let g = (a[i - 1] * j) % 10;
            dp[i][f] += dp[i - 1][j] % m;
            dp[i][g] += dp[i - 1][j] % m;
        }
    }
    for i in 0..10 {
        println!("{}", dp[n][i] % m);
    }
}
