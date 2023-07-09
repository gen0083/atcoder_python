use proconio::input;

fn main() {
    input! {
        t: i32,
    }
    let mut three = vec![1_i128; 38];
    for i in 1..38 {
        three[i] = three[i - 1] * 3;
    }
    for _ in 0..t {
        input! { n: i128, k: i128,}
        let mut target = n;
        let mut i = k; // 3^0=1 の個数
        loop {
            if target == i {
                println!("Yes");
                break;
            } else if target <= i {
                println!("No");
                break;
            }
            for &th in three.iter().rev() {
                if th > target {
                    continue;
                }
                target -= th;
                i -= 1;
                break;
            }
            if i < 0 {
                println!("No");
                break;
            }
        }
    }
}
