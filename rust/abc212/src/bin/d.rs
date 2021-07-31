use proconio::input;
use std::{collections::BinaryHeap, io::stdin};

fn main() {
    let mut q = String::new();
    stdin().read_line(&mut q).ok();
    let n: usize = q.trim().parse().unwrap();
    let mut geta = 0;
    let mut heap = BinaryHeap::new();
    for _i in 0..n {
        let mut q = String::new();
        stdin().read_line(&mut q).ok();
        let query: Vec<&str> = q.trim().split(' ').collect();
        match query[0] {
            "1" => {
                let x: i64 = query[1].parse().unwrap();
                heap.push(-(x - geta));
            }
            "2" => {
                let x: i64 = query[1].parse().unwrap();
                geta += x;
            }
            _ => {
                let x = -heap.pop().unwrap();
                println!("{}", x + geta);
            }
        }
    }
}
