#[test]
fn stack_sample() {
	// stackとして使うのであればVecが利用できる
	let mut stack = Vec::<i32>::new();
	stack.push(3);
	stack.push(10);
	println!("current stack: {:?}", stack);
	println!("pop: {:?}", stack.pop());
	println!("after stack: {:?}", stack);
}

#[test]
fn using_stack() {
	let mut stack = vec![];
	stack.push(1);
	stack.push(10);
	stack.push(3);
	assert_eq!(stack.pop(), Some(3));
	assert_eq!(stack.pop(), Some(10));
	stack.push(5);
	assert_eq!(stack.pop(), Some(5));
}

#[test]
fn range_test() {
	for i in 0..3 {
		println!("{}", i);
	}
	for i in 0..=3 {
		println!("{}", i);
	}
	for i in 3..0 {
		// no output
		println!("{}", i);
	}
	for i in (3..0).rev() {
		// 逆順が必要な場合はrev()を使う
		println!("{}", i);
	}
}