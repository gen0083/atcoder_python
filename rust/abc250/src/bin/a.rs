use proconio::input;

fn main() {
    input! {
         h: u8,
         w: u8,
         r: u8,
         c: u8,
    }
    let mut count = 0;
    if h != 1 {
        if r == h || r == 1 {
            count += 1;
        } else {
            count += 2;
        }
    }
    if w != 1 {
        if c == w || c == 1 {
            count += 1;
        } else {
            count += 2;
        }
    }
    print!("{}", count);
}
