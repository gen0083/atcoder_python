use proconio::input;

fn main() {
    input!{
        n: isize,
        mut c: [u64; n]
    }
    c.sort();
    let mut ans: u64 = 1;
    let base = 1_000_000_007u64;
    for (i, v) in c.iter().enumerate() {
        let f = v - i as u64;
        if f == 0 {
            println!("0");
            return;
        }
        ans *= f;
        ans %= base;
    }
    println!("{}", ans);
}
