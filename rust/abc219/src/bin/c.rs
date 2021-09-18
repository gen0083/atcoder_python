use std::collections::HashMap;
use proconio::marker::Chars;
use proconio::input;

fn main() {
    input! {
        x: Chars,
        n: usize,
        s: [String; n]
    }
    let mut dict: HashMap<char, usize> = HashMap::new();
    for i in 0..x.len() {
        dict.entry(x[i]).or_insert(i);
    }
    let mut people: Vec<(Vec<usize>, String)> = s.into_iter().map(|s| {
        let new_name: Vec<usize> = s.chars().into_iter().map(|c| dict[&c]).collect();
        (new_name, s)
    }).collect();
    people.sort_by(|a, b| a.0.cmp(&b.0));
    for (_, name) in people {
        println!("{}", name);
    }
}
