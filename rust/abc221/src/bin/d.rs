use std::collections::BinaryHeap;

use proconio::input;

fn main() {
    input!{
        n: usize,
        data: [(i32, i32); n]
    }
    let mut log: BinaryHeap<User> = BinaryHeap::new();
    let mut login: Vec<u64> = vec![0; n+1];
    for (a, b) in data {
        log.push(User::IN(-a));
        let o = a+b;
        log.push(User::OUT(-o));
    }
    let mut current = 0;
    loop {
        match log.pop() {
            Some(u) => {
                let d = match u {
                    User::IN(dd) => {-dd},
                    User::OUT(dd) => {-dd}
                };
            },
            None => {}
        }
    }
}

#[derive(PartialEq, Eq, PartialOrd, Ord)]
enum User {
    IN(i32),
    OUT(i32),
}