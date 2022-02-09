use std::string;

use proconio::input;

fn main() {
    input!{
        n: u64,
    }
    let base = 998244353;
    let mut i = 1u64;
    while i <= n {
        i*=10;
    }
    i/=10;
    let mut ans = 0u64;
    let mut j = n;
    while i >= 1 {
        let l = (j - i + 1) % base;
        ans += ((l + 1) * l / 2) % base;
        j = i - 1;
        i /= 10;
    }
    println!("{}", ans % base);
}
