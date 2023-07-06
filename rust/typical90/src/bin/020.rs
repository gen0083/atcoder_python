use proconio::input;

fn main() {
    input! {
        a: u64,
        b: u64,
        c: u64,
    }
    let mut d = 1_u64;
    for _ in 0..b {
        d *= c;
    }
    if a < d {
        println!("Yes");
    } else {
        println!("No");
    }
}