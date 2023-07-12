use proconio::input;

fn main() {
    input!{
        n: usize,
    }
    let mut f = vec![1];
    for i in 1..=n {
        f.push(f[i - 1] * i);
    }
    println!("{}", f[n]);
}
