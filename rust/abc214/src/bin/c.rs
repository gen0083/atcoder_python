use std::cmp::min;

use proconio::input;

fn main() {
    input!{
        n: usize,
        s: [u64; n],
        mut t: [u64; n],
    }
    let mut min_t = 1_000_000_001u64;
    let mut min_s = 1_000_000_001u64;
    let mut min_index = 0;
    for i in 0..n {
        match min_t.cmp(&t[i]) {
            std::cmp::Ordering::Less => {},
            std::cmp::Ordering::Equal => {
                if let std::cmp::Ordering::Greater = min_s.cmp(&s[i]) {
                    min_t = t[i];
                    min_s = s[i];
                    min_index = i;
                }
            },
            std::cmp::Ordering::Greater => {
                min_t = t[i];
                min_s = s[i];
                min_index = i;
            },
        }
    }
    let mut base = min_index;
    for _ in 0..n {
        let next = (base+1)%n;
        t[next] = min(t[next], t[base]+s[base]);
        base = next;
    }
    for first in t {
        println!("{}", first);
    }
}
