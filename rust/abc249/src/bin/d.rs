use im_rc::HashMap;
use proconio::input;

fn main() {
    input! {
        n: usize,
        mut a: [usize; n],
    }
    a.sort();
    let mut dic: HashMap<usize, usize> = HashMap::new();
    for i in &a {
        *dic.entry(*i).or_insert(0) += 1
    }
    let mut count = 0usize;
    let mut p = 0usize;
    let mut ii = 0usize;
    for i in (0..n).rev() {
        if p != a[i] {
            p = a[i];
            ii = i;
        }
        for j in (0..ii+1).rev() {
            if a[ii] % a[j] == 0 {
                let k = a[ii] / a[j];
                if let Ok(l) = a.binary_search(&k) {
                    count += dic.get(&k).unwrap();
                }
            }
        }
    }
    println!("{}", count);
}
