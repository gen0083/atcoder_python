use core::cmp::max;
use std::f32::MAX;

use im_rc::HashMap;
use proconio::input;

fn main() {
    input! {
        n: usize,
    }
    let mut origin: HashMap<String, usize> = HashMap::new();
    let mut order: HashMap<usize, usize> = HashMap::new();
    let mut m = 0usize;
    for i in 0..n {
        input! {
            s: String,
            t: usize,
        }
        if let None = origin.get(&s) {
            origin.insert(s, t);
            m = max(m, t);
            if let None = order.get(&t) {
                order.insert(t, i + 1);
            }
        }
    }
    if let Some((i, j)) = order.get_key_value(&m) {
        println!("{}", j);
    }
}
