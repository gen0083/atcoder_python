use std::collections::VecDeque;
/*
 https://doc.rust-lang.org/std/collections/struct.VecDeque.html
 ring-bufferになってるのでfrontとbackへのpush/popは区別して管理される
 そのためindexによるアクセスは可能でもそのままではsliceへの切り出しができないし、ソートもできない
 ソートするには一旦`make_contigous()`を呼び出してからになる
 単にsliceが欲しい場合はas_sliceで取得できるが、front側とback側の2つに分割して返ってくる
*/

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

#[test]
fn queue_extend_with_vec() {
	let mut queue = VecDeque::new();
	queue.push_back(3);
	println!("{:?}", queue);
	let v = [1, 2, 3];
	queue.extend(v);
	println!("{:?}", queue);
}

#[test]
fn queue_sort() {
	let mut queue = VecDeque::new();
	queue.push_back(3);
	queue.push_back(1);
	queue.push_back(9);
	println!("{:?}", queue);
	queue.make_contiguous().sort();
	println!("{:?}", queue);
}

#[test]
fn queue_slice() {
	let mut queue = VecDeque::new();
	queue.push_back(2);
	queue.push_back(9);
	queue.push_back(3);
	queue.push_front(1);
	queue.push_front(10);
	queue.push_front(33);
	println!("{:?}", queue);
	{
		let slice = queue.as_mut_slices();
		println!("{:?}", slice);
	}
	queue.pop_front();
	queue.pop_front();
	queue.pop_front();
	queue.pop_front();
	{
		let slice = queue.as_mut_slices();
		println!("{:?}", slice);
	}
}
