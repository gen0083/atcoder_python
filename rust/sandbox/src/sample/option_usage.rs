#[test]
fn option_with_match() {
	/*
	matchを使うことでOptionを返す関数の戻り値による処理の場合分けができる
	matchを使う場合は網羅しないとコンパイルエラーになる
	Noneの場合に関心がない場合はif letを使うほうが楽
	 */
	let mut stack = vec![0, 1, 2];
	match stack.pop() {
	    None => println!("stack pop with None"),
	    Some(i) => println!("stack pop: {}", i)
	}
	let mut stack: Vec<i32> = vec![];
	match stack.pop() {
	    None => println!("stack pop with None"),
	    Some(i) => println!("stack pop not reach: {}", i)
	}
}

#[test]
fn option_with_if() {
	/*
	if let Some(i) = Optionを返すなにかという式でOptionの中身を代入しつつ処理できる
	Noneの場合はelse節にいくので、いちいち変数で受けてifで判定して・・・というやり方をしなくてよい
	 */
	let mut stack = vec![3, 5, 1];
	if let Some(i) = stack.pop() {
		println!("stack pop: {}", i);
	}
	let mut stack: Vec<i32> = vec![];
	if let Some(i) = stack.pop() {
		println!("stack pop: {}", i);
	} else {
		println!("stack pop with None");
	}
}