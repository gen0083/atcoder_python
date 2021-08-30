use std::collections::BTreeSet;

use proconio::input;

fn main() {
    input!{
        n: usize,
        m: usize,
        a: [usize; n],
    }
    let mut primes: BTreeSet<usize> = BTreeSet::new();
    for mut t in a {
        let mut p = 2usize;
        while t >= p * p {
            if t % p == 0 {
                while t % p == 0 {
                    t /= p
                }
                primes.insert(p);
            }
            p+=1;
        }
        if t > 1 { primes.insert(t); }
    }
    let mut ans = vec![true; m + 1];
    ans[0] = false;
    for p in primes {
        if p > m || !ans[p] {
            continue;
        }
        let mut f = 1usize;
        while m >= f * p {
            ans[f * p] = false;
            f+=1;
        }
    }
    let mut out = vec![];
    for (i, b) in ans.iter().enumerate() {
        if *b {
            out.push(i);
        }
    }
    println!("{}", out.len());
    out.iter().for_each(|i| println!("{}", *i));
}
