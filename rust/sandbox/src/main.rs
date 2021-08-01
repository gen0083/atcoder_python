use std::io::stdin;

fn main() {
    let mut s = String::new();
	stdin().read_line(&mut s).ok();
	println!("read_line from stdin: {}", s);
}

#[cfg(test)]
mod tests {
    // cargo testしたときのみビルドされるモジュールとして宣言している
    // このモジュールでテストのみに使用するヘルパー関数などを定義して使ったりするのに便利
	#[test]
	fn it_works() {
        // #[test]もcargo testのときのみビルドされる
        let a = vec![5, 3, 2, 4, 1];
        let mut b = a.clone();
        b.sort();
        assert_eq!(a, &[5, 3, 2, 4, 1]);
        assert_eq!(b, &[1, 2, 3, 4, 5]);
	}
}