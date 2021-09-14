use std::collections::{BTreeSet, HashMap};
use proconio::input;

fn main() {
    input!{
        n: usize,
        points: [(u64, u64); n]
    }
    let mut count = 0;
    let mut xs_by_y: HashMap<u64, BTreeSet<u64>> = HashMap::new();
    let mut ys_by_x: HashMap<u64, BTreeSet<u64>> = HashMap::new();
    for (x, y) in points.iter() {
        xs_by_y.entry(*y).or_insert(BTreeSet::new());
        ys_by_x.entry(*x).or_insert(BTreeSet::new());
        xs_by_y.get_mut(y).unwrap().insert(*x);
        ys_by_x.get_mut(x).unwrap().insert(*y);
    }
    for (x, y) in points {
        for bx in xs_by_y[&y].range(x+1..) {
            for by in ys_by_x[&x].range(y+1..) {
                if let Some(set) = xs_by_y.get(by) {
                    if set.contains(bx) {
                        count+=1;
                    }
                }
            }
        }
    }
    println!("{}", count);
}
