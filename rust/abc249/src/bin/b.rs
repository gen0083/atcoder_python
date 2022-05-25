use im_rc::HashMap;
use proconio::input;

fn main() {
    input!{
        s: String,
    }
    let mut dic: HashMap<char, usize> = HashMap::new();
    for word in s.chars() {
        let count = dic.entry(word).or_insert(0);
        *count += 1;
    }
    for i in dic.values() {
        if i > &1 {
            println!("No");
            return;
        }
    }
    let mut a = false;
    let mut b = false;
    for c in dic.keys() {
        if c.is_uppercase() {
            a = true;
        }
        if c.is_lowercase() {
            b = true;
        }
    }
    if a && b {
        println!("Yes");
    } else {
        println!("No");
    }
}
