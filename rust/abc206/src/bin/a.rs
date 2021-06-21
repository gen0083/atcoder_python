use proconio::input;
use std::cmp::Ordering;

fn main() {
    input! {
        n: u16,
    }
    let price = (n as f32 * 1.08).floor() as u16;
    match price.cmp(&206) {
        Ordering::Less => println!("Yay!"),
        Ordering::Greater => println!(":("),
        Ordering::Equal => println!("so-so"),
    }
}
