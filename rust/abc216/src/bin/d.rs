use std::collections::{HashMap, VecDeque};
use proconio::input;

fn main() {
    input!{
        n: usize,
        m: usize,
    }
    let mut balls: Vec<VecDeque<usize>> = vec![VecDeque::new(); m];
    for i in 0..m {
        input! {
            k: usize,
            a: [usize; k]
        }
        balls[i].extend(a);
    }
    let mut pool: HashMap<usize, usize> = HashMap::new();
    let mut to_delete: VecDeque<usize> = VecDeque::new();
    let mut count = 0;
    for i in 0..m {
        if let Some(t) = balls[i].pop_front() {
            match pool.get_key_value(&t) {
                Some((v, index)) => {
                    to_delete.push_back(*index);
                    to_delete.push_back(i);
                    count+=2;
                },
                None => {
                    pool.insert(t, i);
                }
            }
        }
    }
    while !to_delete.is_empty() {
        let delete = [to_delete.pop_front(), to_delete.pop_front()];
        for d in delete.iter() {
            if let Some(i) = d {
                if let Some(color) = balls[*i].pop_front() {
                    match pool.get_key_value(&color) {
                        Some((_, index)) => {
                            to_delete.push_back(*index);
                            to_delete.push_back(*i);
                            count+=2;
                        },
                        None => {
                            pool.insert(color, *i);
                        }
                    }
                }
            }
        }
    }
    if count==2*n {
        println!("Yes");
    } else {
        println!("No");
    }
}
