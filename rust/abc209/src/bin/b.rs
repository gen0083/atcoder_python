use proconio::input;

fn main() {
    input!{
        n: isize,
        x: isize,
        a: [isize; n]
    }
    let total: isize = a.iter().sum::<isize>() - n / 2;
    match total.cmp(&x) {
        std::cmp::Ordering::Greater => println!("No"),
        _ => println!("Yes")
    }
}
