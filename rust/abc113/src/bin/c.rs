use std::vec;

use proconio::input;

struct City {
    i: usize,
    p: i32,
    y: i32,
}

fn main() {
    input!{
        n: usize,
        m: usize,
    }
    let mut pref = vec![0; n];
    let mut birth = vec![0; m];
    let mut cities = Vec::<City>::with_capacity(m);
    for i in 0..m {
        input! {
            p: i32,
            y: i32,
        }
        cities.push(City {i, p, y});
    }
    cities.sort_by_key(|c| c.y);
    for c in cities.iter() {
        pref[(c.p - 1) as usize] += 1;
        birth[(c.i)] = pref[(c.p - 1) as usize];
    }
    cities.sort_by_key(|c| c.i);
    for c in cities.iter() {
        println!("{:06}{:06}", c.p, birth[c.i]);
    }
}
