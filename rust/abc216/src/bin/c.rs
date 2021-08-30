use proconio::input;

fn main() {
    input!{
        n: u64
    }
    let s = format!("{:b}", n);
    let ans = s.chars().map(|c| if c == '1' {"BA"} else {"B"}).collect::<String>();
    println!("{}", &ans[1..]);
}
