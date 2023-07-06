use proconio::input;

fn main() {
    input! {
        a: u64,
        b: u64,
        c: u64,
    }
    let loga = log(a);
    let logc = log(c);
    if loga < b * logc {
        println!("Yes");
    } else {
        println!("No");
    }
}

fn log(mut x: u64) -> u64 {
    let mut a = 0;
    while x > 0 {
        x = x >> 1;
        a +=1;
    }
    return a - 1;
}