use proconio::input;

fn main() {
    input!{
        n: usize,
        a: [u64;n],
        x: u64,
    }
    let mut acc = vec![0u64; n];
    acc[0] = a[0];
    for i in 1..n {
        acc[i] = acc[i - 1] + a[i];
    }
    match acc.binary_search(&x) {
        Ok(i) => {
            // Xをはじめて超える位置が必要なので+2（0indexなのでそもそも+1が必要でさらにその+1という意味）
            println!("{}", i + 2);
        },
        Err(i) => {
            if i >= n {
                let sum = acc[n - 1];
                let m = x / sum * n as u64;
                let r = x % sum;
                match acc.binary_search(&r) {
                    Ok(i) => {println!("{}", m + i as u64 + 2)},
                    Err(i) => {println!("{}", m + i as u64 + 1)}
                }
            } else {
                println!("{}", i + 1);
            }
        }
    }
}
