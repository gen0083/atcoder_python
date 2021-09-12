use std::collections::VecDeque;

use proconio::input;

fn main() {
    input! {
        q: usize,
    }
    let mut v: Vec<u64> = vec![];
    let mut is_dirty = true;
    let mut i = 0usize;
    for _ in 0..q {
        input! {
            c: usize,
        }
        if c == 2 {
            println!("{}", v[i]);
            i+=1;
        } else if c == 3 {
            if is_dirty {
                v = v[i..].to_vec();
                v.sort();
                i = 0;
                is_dirty = false;
            }
        } else {
            input! {
                x: u64
            }
            v.push(x);
            is_dirty = true;
        }
    }
}
