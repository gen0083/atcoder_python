use std::usize;

use proconio::input;

fn main() {
    input!{
        n: usize,
        a: [isize; n],
        b: [isize; n],
    }
    let mut total: isize = 0;
    for i in 0..n {
        total += a[i] * b[i];
    }
    let result = if total == 0 {"Yes"} else {"No"};
    println!("{}", result);
}
