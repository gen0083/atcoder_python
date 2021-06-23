use proconio::input;
use std::collections::HashMap;

fn main() {
    input!{
        n: u64,
        a: [u64; n],
    }
    let mut numbers = HashMap::new();
    for i in a.iter() {
        let counter = numbers.entry(i).or_insert(0u64);
        *counter += 1u64;
    }
    let mut remain = n;
    let mut result = 0u64;
    for (_, i) in &numbers {
        remain -= i;
        result += remain * i;
    }
    println!("{}", result);
}
