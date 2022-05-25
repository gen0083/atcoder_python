use proconio::input;

fn main() {
    input!{
        a: usize,
        b: usize,
        c: usize,
        d: usize,
        e: usize,
        f: usize,
        x: usize,
    }
    let mut m = 0usize;
    let mut n = 0usize;
    while m <= x {
        if m + a > x {
            let i = x - m;
            n = n + i * b;
            break;
        } else {
            m += a;
            n = n + a * b;
        }
        m += c;
    }
    let takahashi = n;
    m = 0usize;
    n = 0usize;
    while m <= x {
        if m + d > x {
            let i = x - m;
            n = n + i * e;
            break;
        } else {
            m += d;
            n += d * e;
        }
        m += f;
    }
    let aoki = n;
    match takahashi.cmp(&aoki) {
        std::cmp::Ordering::Less => println!("Aoki"),
        std::cmp::Ordering::Greater => println!("Takahashi"),
        std::cmp::Ordering::Equal => println!("Draw"),
    }
}
