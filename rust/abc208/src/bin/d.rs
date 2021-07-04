use proconio::input;

fn main() {
    input!{
        n: usize,
        m: usize,
    }
    let mut road: Vec<Vec<usize>> = vec![Vec::new(); n + 1];
    let mut cost = vec![vec![0; n + 1]; n + 1];
    for _i in 0..m {
        input! {
            a: usize,
            b: usize,
            c: usize,
        }
        cost[a][b] = c;
        road[a].push(b);
    }
    
}
