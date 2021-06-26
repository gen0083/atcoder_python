use proconio::input;

fn main() {
    input!{
        a: usize,
        b: usize,
        c: usize,
        d: usize,
    }
    if b >= c * d {
        println!("-1");
        return;
    }
    let mut count = 0;
    let mut red = 0usize;
    let mut blue = a;
    while blue > d * red {
        blue += b;
        red += c;
        count += 1;
    }
    println!("{}", count);
}
