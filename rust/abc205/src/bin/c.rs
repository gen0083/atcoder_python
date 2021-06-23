use proconio::input;
use std::cmp::Ordering;

fn main() {
    input! {
        a: i64,
        b: i64,
        c: u64,
    }
    let (aa, bb) = if c % 2 == 0 {
        (a.abs(), b.abs())
    } else {
        (a, b)
    };
    match aa.cmp(&bb) {
        Ordering::Equal => println!("="),
        Ordering::Greater => println!(">"),
        Ordering::Less => println!("<"),
    };
}
