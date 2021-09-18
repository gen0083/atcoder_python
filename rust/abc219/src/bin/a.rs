use proconio::input;

fn main() {
    input!{
        x: u16
    }
    if x >= 90 {
        println!("expert");
    } else if x >= 70 {
        println!("{}", 90 - x);
    } else if x >= 40 {
        println!("{}", 70 -x);
    } else {
        println!("{}", 40 - x);
    }
}
