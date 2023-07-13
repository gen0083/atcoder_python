use proconio::input;

fn main() {
    input!{
        n: usize,
        a: [i64; n],
    }
    let mut b = a[0];
    for &i in a[1..].iter() {
        let mut c = i;
        while b >= 1 && c >= 1 {
            if b > c {
                b = b % c;
            } else {
                c = c % b;
            }
        }
        if c >= 1 {
            b = c;
        }
    }
    println!("{}", b);
}
