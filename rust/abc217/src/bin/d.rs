use proconio::input;

fn main() {
    input!{
        l: u64,
        q: usize,
        query: [(u8, u64); q]
    }
    let mut wood = vec![0, l];
    for (t, x) in query {
        let i = wood.binary_search(&x);
        if let Err(p) = i {
            if t == 1 {
                wood.insert(p, x);
            } else {
                println!("{}", wood[p] - wood[p - 1]);
            }
        }
    }
}
