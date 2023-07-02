use proconio::input;

fn main() {
    input! {
        n: usize,
        l: u64,
        k: usize,
        a: [u64; n],
    }
    let mut p = 0_u64;
    let mut len = vec![0_u64; n + 1];
    for (i, &v) in a.iter().enumerate() {
        len[i] = v - p;
        p = v;
    }
    len[n] = l - p;
    // 二分探索
    let mut left = 0_u64;
    let mut right = l;
    while left + 1 < right {
        let c = (left + right) / 2;
        let mut count = 0_usize;
        let mut sum = 0_u64;
        for i in len.iter() {
            if count > k {
                break;
            }
            sum += i;
            if sum >= c {
                sum = 0;
                count += 1;
            }
        }
        if count > k {
            left = c;
        } else {
            right = c;
        }
    }
    println!("{}", left);
}
