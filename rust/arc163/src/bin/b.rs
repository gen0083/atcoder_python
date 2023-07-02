use std::f32::consts::E;

use proconio::input;

fn main() {
    input!{
        n: usize,
        m: usize,
        a: [u64; n],
    }
    let mut l = a[0];
    let mut r = a[1];
    let &mut ai = &a[2..];
    ai.sort();
    let mut li = match ai.binary_search(&l) {
        Ok(i) => i,
        Err(i) => i + 1
    };
    let mut ri = match ai.binary_search(&r) {
        Ok(i) => i,
        Err(i) => i - 1,
    };
    if ri - li >= m {
        println!("0");
        return;
    }
    
}
