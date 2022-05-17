use proconio::input;

fn main() {
    input!{
        s: String,
    }
    let l = 6 / s.len();
    for _ in 0..l {
        print!("{}", s);
    }
}
