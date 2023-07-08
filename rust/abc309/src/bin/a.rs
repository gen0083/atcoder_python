use proconio::input;

fn main() {
    input!{
        a: usize,
        b: usize,
    }
    let v = vec![[1,2,3,0], [4,5,6,0], [7,8,9,0],[0,0,0,0]];
    let mut m = false;
    if a == 1 && b == 2 {
        m = true;
    }
    if a == 2 && (b ==3) {
        m = true;
    }
    if a==4 && (b==5) {
        m = true;
    }
    if a==5 && (b== 6) {
        m = true;
    }
    if a== 7&& b== 8 {
        m = true;
    }
    if a==8&&b==9 {
        m = true;
    }
    if m {
        println!("Yes");
    } else {
        println!("No");
    }
}
