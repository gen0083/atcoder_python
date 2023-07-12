use itertools::Itertools;
use proconio::input;

fn main() {
    input!{
        n: i64,
    }
    let mut i = 2_i64;
    let mut t = n;
    let mut a = vec![];
    while i * i <= t {
        while t % i == 0 {
            a.push(i);
            t /= i;
        }
        i += 1;
    }
    if t != 1 {
        a.push(t);
    }
    println!("{}", a.iter().map(|i| i.to_string()).join(" "));
}
