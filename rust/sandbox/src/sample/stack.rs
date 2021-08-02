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