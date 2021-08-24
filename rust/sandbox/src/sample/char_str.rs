#[test]
fn char_to_str() {
	let chars = vec!['a', 'b', 'c'];
	println!("base: {:?}", chars);
	let s = chars.iter().collect::<String>();
	println!("to String: {:?}", s);
}

#[test]
fn str_to_chars() {
	let str = "abc";
	println!("base: {:?}", str);
	let chars = str.chars().collect::<Vec<_>>();
	println!("to Vec<char>: {:?}", chars);
}