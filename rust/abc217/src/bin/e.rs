use std::collections::VecDeque;

use proconio::input;

fn main() {
    input! {
        q: usize,
    }
    let mut queue: VecDeque<u64> = VecDeque::new();
    let mut is_dirty = true;
    for _ in 0..q {
        input! {
            c: usize,
        }
        if c == 2 {
            println!("{}", queue.pop_front().unwrap());
        } else if c == 3 {
            if is_dirty {
                queue.make_contiguous().sort();
                is_dirty = false;
            }
        } else {
            input! {
                x: u64
            }
            queue.push_back(x);
            is_dirty = true;
        }
    }
}
