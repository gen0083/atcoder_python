use std::cmp::min;

use proconio::input;

fn main() {
    input! {
        n: usize,
        mut a: [i64; n],
        q: usize,
        b: [i64; q],
    }
    a.sort();
    for bj in b {
        match a.binary_search(&bj) {
            Ok(_) => println!("0"),
            Err(i) => {
                let mut ans = 1000000000_i64;
                if i > a.len() - 1 {
                    ans = min(ans, (a.last().unwrap() - bj).abs());
                } else {
                    match i.checked_sub(1) {
                        Some(j) => ans = min((a[i] - bj).abs(), (a[j] - bj).abs()),
                        None => ans = a[i] - bj.abs(),
                    };
                }
                println!("{}", ans);
            }
        }
    }
}
