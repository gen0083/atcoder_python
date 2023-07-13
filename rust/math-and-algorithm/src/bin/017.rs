use proconio::input;

fn main() {
    input!{
        n: usize,
        a: [i128; n],
    }
    let mut l = lcm(a[0], a[1]);
    for &i in a[2..].iter() {
        // 1個ずつLCMを求めて計算する
        l = lcm(l, i);
    }
    println!("{}", l);
}

fn gcd(mut a: i128, mut b: i128) -> i128 {
    while a >= 1 && b >= 1 {
        if a > b {
            a = a % b;
        } else {
            b = b % a;
        }
    }
    if b >= 1 {
        a = b;
    }
    return a;
}

fn lcm(a: i128, b: i128) -> i128 {
    return a * b / gcd(a, b);
}
