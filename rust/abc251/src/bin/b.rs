use im_rc::HashSet;
use proconio::input;

fn main() {
    input!{
        n: usize,
        w: usize,
        mut a: [usize; n],
    }
    a.sort();
    let mut ans: HashSet<usize> = HashSet::new();
    for i in &a {
        if i <= &w {
            ans.insert(*i);
        } else {
            break;
        }
    }
    for i in 0..n - 1 {
        for j in i+1..n {
            let k = &a[i] + &a[j];
            if k <= w {
                ans.insert(k);
            } else {
                break;
            }
        }
    }
    for i in 0..n - 2 {
        for j in i+1 .. n - 1 {
            for k in j+1..n {
                let l = &a[i] + &a[j] + &a[k];
                if l <= w {
                    ans.insert(l);
                } else {
                    break;
                }
            }
        }
    }
    println!("{}", ans.len());
}
