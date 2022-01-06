use std::cmp::{max, min};

use proconio::input;

fn main() {
    input!{
        n: i64,
        a: i64,
        b: i64,
        p: i64,
        q: i64,
        r: i64,
        s: i64,
    }
    let template = ".".repeat((s-r+1) as usize);
    let p1f = max(1 - a, 1 - b);
    let p2f = max(1 -a, b - n);
    let p1t = min(n - a, n - b);
    let p2t = min(n - a, b - 1);
    let p1range = p1f..=p1t;
    let p2range = p2f..=p2t;
    for c in p..=q {
        let k = c - a;
        let mut t = template.clone();
        if p1range.contains(&k) {
            let b1 = b + k - r;
            if b1 >= 0 && b1 <= s - r {
                let b1 = b1 as usize;
                t.replace_range(b1..b1+1, "#");
            }
        }
        if p2range.contains(&k) {
            let b2 = b - k - r;
            if b2 >= 0 && b2 <= s - r {
                let b2 = b2 as usize;
                t.replace_range(b2..b2+1, "#");
            }
        }
        println!("{}", t);
    }
}
