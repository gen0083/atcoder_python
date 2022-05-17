use std::ops::Index;

use proconio::input;

fn main() {
    input!{
        n: usize,
        a: usize,
        b: usize,
    }
    let i = n * b;
    let mut tile: Vec<&String> = vec![&".".repeat(i); 2];
    let mut j = 0;
    let mut k = 0;
    let mut l = 0;
    while j <= i {
        l = j / n % 2;
        tile[l][j] = "#";
        j += 1;
    }
    for j in 0..n*a {
        l = j / n % 2;
        println!("{}", tile[l].join(""));
    }
}
