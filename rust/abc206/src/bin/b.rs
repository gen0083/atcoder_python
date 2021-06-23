use proconio::input;

fn main() {
    input! {
        n: u32,
    }
    let mut total = 0;
    let mut day = 0;
    loop {
        day += 1;
        total += day;
        if total >= n {
            break;
        }
    }
    println!("{}", day);
}
