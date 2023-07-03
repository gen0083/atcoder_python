use proconio::input;

fn main() {
    input! {
        n: usize,
    }
    'a: for i in 1..(1 << (n)) {
        let mut count = 0;
        let mut a = String::new();
        for j in (0..n).rev() {
            let b = 1 << j;
            if i & b == b {
                count -= 1;
                a += ")";
            } else {
                count += 1;
                a += "(";
            }
            if count < 0 {
                continue 'a;
            }
        }
        if count == 0 {
            println!("{}", a);
        }
    }
}
