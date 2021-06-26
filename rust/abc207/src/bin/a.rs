use proconio::input;
use std::cmp::min;

fn main() {
    input!{
        a: usize,
        b: usize,
        c: usize,
    }
    let m = min(a, min(b, c));
    let result = a + b + c - m;
    println!("{}", result);
}
