use std::collections::{BinaryHeap, VecDeque};

use proconio::input;

fn main() {
    input! {
        q: usize,
    }
    let mut queue: VecDeque<i64> = VecDeque::new();
    let mut heap: BinaryHeap<i64> = BinaryHeap::new();
    for _ in 0..q {
        input! {
            c: usize,
        }
        if c == 2 {
            match heap.pop() {
                Some(i) => {
                    println!("{}", -i);
                },
                None => {
                    if let Some(j) = queue.pop_front() {
                        println!("{}", -j);
                    }
                }
            }
        } else if c == 3 {
            if !queue.is_empty() {
                heap.extend(queue.iter());
                queue.clear();
            }
        } else {
            input! {
                x: i64
            }
            queue.push_back(-x);
        }
    }
}
