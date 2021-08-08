use std::collections::HashSet;

use proconio::input;

fn main() {
    input!{
        n: usize,
        roads: [(usize, usize); n - 1]
    }
    let mut town: Vec<HashSet<usize>> = vec![HashSet::new(); n];
    for r in roads {
        town[r.0 - 1].insert(r.1 - 1);
        town[r.1 - 1].insert(r.0 - 1);
    }
    let mut stack = vec![0usize];
    let mut visited = HashSet::<usize>::new();
    let mut current = 0usize;
    let mut ans = String::from("1");
    while !stack.is_empty() {
        let next = town[current].clone();
        match next.iter().min() {
            Some(p) => {
                town[current].remove(&p);
                if visited.contains(&p) {
                    continue;
                }
                current = *p;
                stack.push(*p);
                visited.insert(*p);
            },
            None => {
                let next = stack.pop();
                match next {
                    Some(i) => {
                        current = i;
                        continue;
                    },
                    None => {break;}
                }
            }
        }
        ans.push_str(&format!(" {}", current + 1));
    }
    println!("{}", ans);
}
