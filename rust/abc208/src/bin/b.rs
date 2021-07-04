use proconio::input;

fn main() {
    input!{
        mut p: usize,
    }
    let mut coins = [1; 11];
    for i in 2..11 {
        coins[i] = coins[i - 1] * i;
    }
    let mut num = 0;
    for i in (1..11).rev() {
        let c = p / coins[i];
        num += c;
        p -= coins[i] * c;
    }
    println!("{}", num);
}
