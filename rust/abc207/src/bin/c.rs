use proconio::input;

struct Period {
    t: u8,
    l: usize,
    r: usize,
}

fn main() {
    input! {
        n: usize,
    }
    let mut all = Vec::<Period>::with_capacity(n);
    for i in 0..n {
        input! {
            t: u8,
            l: usize,
            r: usize,
        }
        all.push(Period { t, l, r });
    }
    // 前処理としてlの昇順でソートしてやると考えることが減ってあとが楽
    all.sort_by(|o1, o2| o1.l.cmp(&o2.l).then_with(|| o1.r.cmp(&o2.r)));
    let mut result = 0;
    for i in 0..n - 1 {
        let base = &all[i];
        for j in i + 1..n {
            let other = &all[j];
            if base.r < other.l {
                break;
            }
            if base.r == other.l {
                if base.t % 2 == 1 && other.t <= 2 {
                    result += 1;
                }
            } else {
                if base.t % 2 == 1 {
                    if base.r >= other.l {
                        result += 1;
                    }
                } else {
                    if base.r > other.l {
                        result += 1;
                    }
                }
            }
        }
    }
    println!("{}", result);
}
