use proconio::input;

fn main() {
    input!{
        n: usize,
        m: usize,
        p: [usize; n-1],
        mut h: [(usize, usize); m],
    }
    h.sort();
    let mut x = 1_usize;
    let mut y = 0_usize;
    for (parent, gen) in h {
        if x != parent {
            x = parent;
            
        }
    }

}
