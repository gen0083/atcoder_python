use std::cmp::min;
j
use proconio::input;

fn main() {
    input! {
        n: usize,
        mut a: [i64; n],
        q: usize,
        b: [i64; q],
    }
    a.sort();
    'q: for bj in b {
        let mut left = 0_usize;
        let mut right = a.len() - 1;
        while left + 1 < right {
            let c = (left + right) / 2;
            match a[c].cmp(&bj) {
                std::cmp::Ordering::Greater => right = c,
                std::cmp::Ordering::Less => left = c,
                std::cmp::Ordering::Equal => {
                    println!("0");
                    continue 'q;
                }
            }
        }
        let ans = min((a[left] - bj).abs(), (a[right] - bj).abs());
        println!("{}", ans);
    }
}
