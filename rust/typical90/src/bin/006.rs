use std::collections::HashMap;

use proconio::{input, marker::Chars};

fn main() {
    input! {
        n: usize,
        k: usize,
        s: Chars,
    }

    let mut alpha: HashMap<u8, usize> = HashMap::<u8, usize>::new();
    let mut i = 0_usize;
    for a in b'a'..=b'z' {
        alpha.insert(a, i);
        i+=1;
    }
    let mut next = vec![vec![n; 26]; n +1];
    for (i, c) in s.iter().enumerate().rev() {
        let a = *alpha.get(&(*c as u8)).unwrap();
        for j in 0..26 {
            next[i][j] = next[i+1][j];
        }
        next[i][a] = i;
    }
    let mut ans = String::new();
    let mut u = 0_usize;
    for i in 0..k {
        let needs = k - i;
        for j in 0_usize..26 {
            let r = n - next[u][j];
            if r >= needs {
                ans += &s[next[u][j]].to_string();
                u = next[u][j] + 1;
                break;
            }
        }
    }
    println!("{}", ans);
}

/*
AtCoderではRustのバージョンのせいでCEになるためこんな方法をとってる
元のコード

use std::collections::HashMap;
 
use proconio::{input, marker::Chars};
 
fn main() {
    input! {
        n: usize,
        k: usize,
        s: Chars,
    }
    let mut alpha = HashMap::<char, usize>::new();
    let mut i = 0_usize;
    for a in 'a'..='z' {
        alpha.insert(a, i);
        i+=1;
    }
    let mut next = vec![vec![n; 26]; n +1];
    for (i, c) in s.iter().enumerate().rev() {
        let a = *alpha.get(&c).unwrap();
        for j in 0..26 {
            next[i][j] = next[i+1][j];
        }
        next[i][a] = i;
    }
    let mut ans = String::new();
    let mut u = 0_usize;
    for i in 0..k {
        let needs = k - i;
        for j in 0_usize..26 {
            let r = n - next[u][j];
            if r >= needs {
                ans += &s[next[u][j]].to_string();
                u = next[u][j] + 1;
                break;
            }
        }
    }
    println!("{}", ans);
}
*/