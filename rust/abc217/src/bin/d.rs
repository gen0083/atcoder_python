use std::collections::BTreeSet;

use proconio::input;

fn main() {
    input!{
        l: u64,
        q: usize,
        query: [(u8, u64); q]
    }
    let mut wood = BTreeSet::new();
    wood.insert(0);
    wood.insert(l);
    for (t, x) in query {
        if t == 1 {
            wood.insert(x);
        } else {
            let l = wood.range(..x).next_back().unwrap();
            let r = wood.range(x..).next().unwrap();
            println!("{}", *r - *l);
        }
    }
}
