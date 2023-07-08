use proconio::input;

fn main() {
    input!{
        n: usize,
        a: [[u8;n]; n],
    }
    let mut b = vec![vec![0_u8;n];n];
    for i in 0..n {
        for j in 0..n {
            if i == 0 || j == 0 || i == n-1 || j==n-1{
                // rotate
            }
        }
    }
}
