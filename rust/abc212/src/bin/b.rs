use ascii::Chars;
use proconio::input;

fn main() {
    input!{
        t: String,
    }
    let x: Vec<u32> = t.chars().map(|c| c.to_digit(10).unwrap()).collect();
    if x[0] == x[1] && x[0] == x[2] && x[0] == x[3] {
        println!("Weak");
    } else {
        let mut is_week = true;
        for i in 0..3 {
            if (x[i] + 1) % 10 != x[i + 1] {
                is_week = false;
                break;
            }
        }
        if is_week {
            println!("Weak");
        }else {
            println!("Strong");
        }
    }
}
