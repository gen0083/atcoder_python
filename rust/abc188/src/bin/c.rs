use proconio::input;
use std::collections::VecDeque;

fn main() {
    input! {
        n: u32,
        a: [u64; 2i32.pow(n)],
    }
    // queueを使ってインデックスを全マッチさせて最後にのこった2つのうち負けたほうを出力する作戦
    // RustではVecDequeを使うといいみたい
    // 0..a.len()のリスト初期化のやり方がわからんかったが、なんかいいやり方ないのかな？
    let mut t = (0..).take(a.len()).collect::<VecDeque<usize>>();
    while t.len() > 2 {
        let mut lim = t.len();
        while lim > 0 {
            let p1 = t.pop_front().unwrap();
            let p2 = t.pop_front().unwrap();
            if a[p1] > a[p2] {
                t.push_back(p1);
            } else {
                t.push_back(p2);
            }
            lim -= 2;
        }
    }
    let result = if a[t[0]] > a[t[1]] {
        t[1]
    } else {
        t[0]
    };
    println!("{}", result + 1);
}
