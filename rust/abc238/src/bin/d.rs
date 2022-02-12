use proconio::input;

fn main() {
    input! {
        t: usize,
        case: [(u64, u64); t]
    }
    for (mut a, mut s) in case {
        let mut k0 = true;
        let mut k1 = false;
        while a > 0 || s > 0 {
            let i = a % 2;
            let j = s % 2;
            let mut c0 = false;
            let mut c1 = false;
            if k0 {
                if i == 0 {
                    c0 |= true;
                } else {
                    c0 |= j == 0;
                    c1 |= j == 0;
                }
            }
            if k1 {
                if i == 0 {
                    c0 |= j == 1;
                    c1 |= j == 0;
                } else {
                    c1 |= j == 1;
                }
            }
            k0 = c0;
            k1 = c1;
            if !(c0 || c1) {
                break;
            }
            a /= 2;
            s /= 2;
        }
        if k0 && !k1 {
            println!("Yes");
        } else {
            println!("No");
        }
    }
}
