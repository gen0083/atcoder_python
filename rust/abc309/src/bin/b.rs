use std::collections::VecDeque;

use proconio::{input, marker::Chars};

fn main() {
    input! {
        n: usize,
        a: [Chars; n],
    }
    let mut b = vec![vec![' '; n]; n];
    let mut r = VecDeque::<char>::new();
    for i in 0..n {
        for j in 0..n {
            b[i][j] = a[i][j];
        }
    }
    for i in 0..n {
        r.push_back(a[0][i]);
    }
    for i in 1..n {
        r.push_back(a[i][n - 1]);
    }
    for i in (0..n - 1).rev() {
        r.push_back(a[n - 1][i]);
    }
    for i in (1..n - 1).rev() {
        r.push_back(a[i][0]);
    }
    r.rotate_right(1);
    for i in 0..n {
        b[0][i] = r.pop_front().unwrap();
    }
    for i in 1..n {
        b[i][n - 1] = r.pop_front().unwrap();
    }
    for i in (0..n - 1).rev() {
        b[n - 1][i] = r.pop_front().unwrap();
    }
    for i in (1..n - 1).rev() {
        b[i][0] = r.pop_front().unwrap();
    }
    for i in 0..n {
        let mut res = String::new();
        for j in 0..n {
            res += b[i][j].to_string().as_str();
        }
        println!("{}", res);
    }
}
