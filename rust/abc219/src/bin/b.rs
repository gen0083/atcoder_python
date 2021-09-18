use proconio::input;

fn main() {
    input!{
        s1: String,
        s2: String,
        s3: String,
        t: String
    }
    let mut ans = String::from("");
    for i in t.chars() {
        match i {
            '1' => {
                ans += &s1;
            },
            '2' => {
                ans += &s2;
            },
            _ => {
                ans += &s3;
            }
        }
    }
    println!("{}", ans);
}
