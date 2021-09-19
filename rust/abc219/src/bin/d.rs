use std::cmp::max;
use std::cmp::min;
use proconio::input;

fn main() {
    input!{
        n: usize,
        x: usize,
        y: usize,
        o: [(usize, usize); n]
    }
    let inf = 301;
    let mut dp: Vec<Vec<Vec<usize>>> = vec![vec![vec![inf; y+1]; x+1]; 2];
    // initialize
    dp[1][0][0] = 0;
    dp[0][0][0] = 0;
    // for i in 0..2 {
    //     for j in 0..=x {
    //         dp[i][j][0] = 0;
    //     }
    //     for j in 0..=y {
    //         dp[i][0][j] = 0;
    //     }
    // }
    for i in 0..n {
        let before = i%2;
        let current = (i+1)%2;
        // 弁当iを選択する場合に達成可能なたこj個、たいk個の更新
        let tako = min(o[i].0, x);
        let tai = min(o[i].1, y);
        // i個目の弁当をただ1つ選んだ場合に達成可能なところを埋める
        dp[current][tako][tai] = min(dp[before][tako][tai], 1);
        // 直前の集計結果より、i個目の1つ前までの弁当の選択によって達成可能な最小個数を元に
        // i個目の弁当を選択することによって達成できる最小個数を更新していく
        for j in 0..=x {
            for k in 0..=y {
                // i個目の弁当を選ぶ場合
                // xx,yyはi個目を選んだ場合に得られるたこ・たいがx/yを超えた場合はx/yとして扱うためのリミッター
                let xx = min(j + tako, x);
                let yy = min(k+tai, y);
                dp[current][xx][yy] = min(dp[current][xx][yy], dp[before][j][k] + 1);
                // i個目の弁当を選ばない場合
                dp[current][j][k] = min(dp[current][j][k], dp[before][j][k]);
            }
        }
    }
    if dp[n%2][x][y] >= inf {
        println!("-1");
    } else {
        println!("{}", dp[n%2][x][y]);
    }
}