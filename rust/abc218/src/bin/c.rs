use proconio::marker::Chars;
use std::cmp::max;
use std::cmp::min;
use proconio::input;

fn main() {
    input!{
        n: usize,
        o: [Chars; n],
        t: [Chars; n]
    }
    let mut o_shape: Vec<(usize, usize)> = vec![];
    let mut min_x = n;
    let mut max_x = 0usize;
    let mut min_y = n;
    let mut max_y = 0usize;
    for y in 0..n {
        for x in 0..n {
            if o[y][x] == '#' {
                min_x = min(min_x, x);
                min_y = min(min_y, y);
                max_x = max(max_x, x);
                max_y = max(max_y, y);
            }
        }
    }
    for y in min_y..=max_y {
        for x in min_x..=max_x {
            o_shape.push((y, x));
        }
    }
    min_x = n;
    max_x = 0usize;
    min_y = n;
    max_y = 0usize;
    for y in 0..n {
        for x in 0..n {
            if t[y][x] == '#' {
                min_x = min(min_x, x);
                min_y = min(min_y, y);
                max_x = max(max_x, x);
                max_y = max(max_y, y);
            }
        }
    }
    let mut t_shape: Vec<Vec<(usize, usize)>> = vec![];
    let mut s: Vec<(usize, usize)> = vec![];
    for y in min_y..=max_y {
        for x in min_x..=max_x {
            s.push((y, x));
        }
    }
    t_shape.push(s);
    s = vec![];
    for x in min_x..=max_x {
        for y in (min_y..=max_y).rev() {
            s.push((y, x));
        }
    }
    t_shape.push(s);
    s = vec![];
    for y in (min_y..=max_y).rev() {
        for x in (min_x..=max_x).rev() {
            s.push((y, x));
        }
    }
    t_shape.push(s);
    s = vec![];
    for x in (min_x..=max_x).rev() {
        for y in min_y..=max_y {
            s.push((y, x));
        }
    }
    t_shape.push(s);
    for s in t_shape {
        if s.len() != o_shape.len() {
            continue;
        } else {
            let con = o_shape.iter().zip(s.iter())
            .filter(|(&(oy, ox), &(ty, tx))| o[oy][ox] == t[ty][tx])
            .count();
            if con == o_shape.len() {
                println!("Yes");
                return;
            }
        }
    }
    println!("No");
}
