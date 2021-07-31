use core::cmp::min;
use proconio::input;

fn main() {
    input! {
        n: usize,
        m: usize,
        mut a: [i32; n],
        mut b: [i32; m],
    }
    a.sort();
    b.sort();
    let mut i = 0usize;
    let mut j = 0usize;
    let mut ans = 1_000_000_001;
    while i < n && j < m {
        ans = min((a[i] - b[j]).abs(), ans);
        if ans == 0 {
            break;
        }
        if a[i] < b[j] {
            i += 1;
        } else {
            j += 1;
        }
    }
    println!("{}", ans);
}
