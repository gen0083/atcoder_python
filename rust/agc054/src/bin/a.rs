use proconio::input;
use proconio::marker::Chars;

fn main() {
    input!{
        _n: usize,
        s: Chars,
    }
    let f = s.first().unwrap();
    let l = s.last().unwrap();
    if f != l {
        println!("1");
        return;
    }
    let mut o = 0;
    for c in &s  {
        if c == f {
            o = 0;
        } else {
            o += 1;
        }
        if o > 1 {
            println!("2");
            return;
        }
    }
    println!("-1");
}
