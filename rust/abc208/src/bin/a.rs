use proconio::input;

fn main() {
    input!{
        a: usize,
        b: usize,
    }
    if b < a {
        println!("No");
        return;
    }
    if b > a*6 {
        println!("No");
        return;
    }
    println!("Yes");
}
