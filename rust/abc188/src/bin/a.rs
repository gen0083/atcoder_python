use proconio::input;

fn main() {
    input! {
        x: i8,
        y: i8,
    }
    // absは絶対値なのでu8とかだと存在しない
    //（負数が存在しないのだから当たり前）
    let result = if (x - y).abs() < 3 { "Yes" } else { "No" };
    println!("{}", result);
}
