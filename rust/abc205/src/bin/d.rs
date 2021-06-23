use proconio::input;

fn main() {
    input! {
        n: usize,
        q: usize,
        a: [u64; n],
        k: [u64; q],
    }
    for t in k.iter() {
        if t < &a[0] {
            println!("{}", t);
            continue;
        }
        if t > &a[n - 1] {
            println!("{}", t + n as u64);
            continue;
        }
        let mut l = 0;
        let mut r = n;
        while l + 1 < r {
            let c = (l + r) / 2;
            if a[c] < t + c as u64 + 1{
                l = c;
            } else {
                r = c;
            }
        }
        println!("{}", t + l as u64 + 1);
    }
}
