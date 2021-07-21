use proconio::input;

fn main() {
    input!{
        a: isize,
        b: isize,
    }
    let ans = b - a + 1;
    match ans.cmp(&0) {
        std::cmp::Ordering::Less => println!("0"),
        _ => println!("{}", ans)
    }
}
