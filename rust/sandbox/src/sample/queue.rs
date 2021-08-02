use std::collections::VecDeque;

#[test]
fn queue_sample() {
	// 先入れ先出しをしたい（queueとして使いたい）場合はVecDequeを使う
	let mut queue = VecDeque::<i32>::new();
	queue.push_back(4);
	queue.push_back(9);
	queue.push_back(1);
	println!("current queue: {:?}", queue);
	println!("pop front: {:?}", queue.pop_front());
	println!("after queue: {:?}", queue);
}