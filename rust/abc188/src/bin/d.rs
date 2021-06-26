use proconio::input;
use std::cmp::{max, min};
use std::collections::BinaryHeap;

#[derive(Copy, Clone, Eq, PartialEq)]
struct Service {
    start: u64,
    end: u64,
    cost: u64,
}

impl Ord for Service {
    fn cmp(&self, other: &Self) -> std::cmp::Ordering {
        other
            .start
            .cmp(&self.start)
            .then_with(|| self.end.cmp(&other.end))
    }
}

impl PartialOrd for Service {
    fn partial_cmp(&self, other: &Self) -> Option<std::cmp::Ordering> {
        Some(self.cmp(other))
    }
}

fn main() {
    input! {
        n: usize,
        p: u64,
    }
    let mut services = BinaryHeap::new();
    for _ in 0..n {
        input! {
            a: u64,
            b: u64,
            c: u64,
        }
        services.push(Service {
            start: a,
            end: b,
            cost: c,
        });
    }
    let mut result = 0u64;
    let mut base = services.pop().unwrap();
    while !services.is_empty() {
        let next = services.pop().unwrap();
        if base.end < next.start {
            result += (base.end - base.start + 1) * min(base.cost, p);
            base = next;
        } else {
            let former_end = min(base.end, next.end);
            let latter_end = max(base.end, next.end);
            // まずかぶってないところを確定させる
            if base.start != next.start {
                result += (next.start - base.start) * min(base.cost, p);
            }
            // はみ出た部分を新たなServiceとしてPriorityQueueに追加
            if former_end != latter_end {
                let split_start = former_end + 1;
                let split_end = latter_end;
                let split_cost = if base.end < next.end {
                    next.cost
                } else {
                    base.cost
                };
                services.push(Service {
                    start: split_start,
                    end: split_end,
                    cost: split_cost,
                });
            }
            // かぶった部分をあらたなServiceとしてみなす
            // 3つ以上のServiceがかぶる可能性があるのでbaseの更新だけする
            let new_start = next.start;
            let new_end = former_end;
            let new_cost = min(base.cost + next.cost, p);
            base = Service {
                start: new_start,
                end: new_end,
                cost: new_cost,
            };
        }
    }
    // 最後に残ったbase分をresultに加算
    result += (base.end - base.start + 1) * min(base.cost, p);
    println!("{}", result);
}
