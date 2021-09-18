use proconio::input;

fn main() {
    input!{
        n: usize,
        x: u32,
        y: u32,
        mut o: [(u32, u32); n]
    }
    // let mut t: Vec<Vec<(u32, u32)>> = vec![vec![(0, 0); n+1]; n+1];
    // for i in 1..=n {
    //     for j in i+1..=n {
    //         // j個目の弁当まででi個選んだときのXYの最大数
    //         let tako = o[i-1].0 + t[i -1][j-1].0;
    //         let tai = o[i-1].1 + t[i -1][j-1].1;
    //         if tako >= x && tai >= y {
    //             println!("{}", i);
    //             return;
    //         }
    //         t[i][j] = (tako, tai);
    //     }
    // }
    // println!("-1");
    o.sort_by(|i, j| j.0.cmp(&i.0));
    let mut i = 0usize;
    let mut tako = 0u32;
    while tako <= x {
        tako += o[i].0;
        i+=1;
    }
    let mut tai = 0u32;
    
}
