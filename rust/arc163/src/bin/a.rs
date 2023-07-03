use proconio::input;

fn main() {
    input!{
        t: usize,
    }
    'outer: for _ in 0..t {
        input! {
            n: usize,
            s: String,
        }
        for i in 1..n {
            let f = &s[..i];
            let t = &s[i..];
            if f < t {
                println!("Yes");
                continue 'outer;
            }
        }
        println!("No");
    }
}
