use std::collections::BinaryHeap;

use proconio::input;

fn main() {
    input!{
        n: usize,
        k: u64,
        a: [u64; n]
    }
    let mut heap: BinaryHeap<u64> = BinaryHeap::new();
    heap.extend(a);
    let mut presure = 0u64;
    for i in 0..k {
        match heap.pop() {
            Some(p) => {
                if p > 0 {
                    presure += p;
                    heap.push(p - 1);
                } else {
                    break;
                }
            },
            None => {
                break;
            }
        }
    }
    println!("{}", presure);
}
