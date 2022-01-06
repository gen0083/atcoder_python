use std::cmp::min;

use proconio::input;

fn main() {
    input!{
        n: usize,
        d: i32,
        mut walls: [(i32, i32); n]
    }
    walls.sort_by(|a, b| a.0.cmp(&b.0).then(a.1.cmp(&b.1)));
    let mut count = 1;
    let mut i = 1usize;
    let (mut l, mut r) = walls[0];
    while i < n {
        let (li, ri) = walls[i];
        if li <= r && ri <= r {
            l = li;
            r = ri;
        } else if li <= r {
            r = min(r, ri);
        } else if r + d <= li{
            l = li;
            r = ri;
            count += 1;
        }
        i += 1;
    }
    println!("{}", count);
}
