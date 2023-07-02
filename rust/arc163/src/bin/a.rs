use proconio::input;

fn main() {
    input!{
        t: usize,
    }
    'outer: for _ in 0..t {
        input! {
            n: usize,
            s: String,
        }
        let f = s.chars().nth(0).unwrap();
        for c in s.chars() {
            println!("{} {}", f, c);
            if c > f {
                println!("Yes");
                continue 'outer;
            }
        }
        'inner: for i in 1_usize..=n/2 {
            let f = &s[..i];
            let t = &s[i..];
            if f.len() > t.len() {
                continue;
            }
            for j in 0..i {
                match f.chars().nth(j).unwrap().cmp(&t.chars().nth(j).unwrap()) {
                    std::cmp::Ordering::Less => {
                        println!("Yes");
                        continue 'outer;
                    },
                    std::cmp::Ordering::Equal => continue,
                    std::cmp::Ordering::Greater => {
                        continue 'inner;
                    }
                }
            }
            if f.len() < t.len() {
                println!("Yes");
                continue 'outer;
            }
        }
        println!("No")
    }
}
