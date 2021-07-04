use proconio::input;

fn main() {
    input!{
        n: isize,
        k: i64,
        a: [isize; n],
    }
    let mut order = a.clone();
    order.sort();
    let base = k as isize / n;
    let r = k as isize % n;
    for num in a.iter() {
        if order.binary_search(num).unwrap() as isize <= r - 1 {
            println!("{}", base + 1);
        } else {
            println!("{}", base);
        }
    }
}
