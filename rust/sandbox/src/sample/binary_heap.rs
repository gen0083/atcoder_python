use std::{cmp::Reverse, collections::BinaryHeap};

#[test]
fn test_binary_heap() {
	let mut heap = BinaryHeap::new();
	heap.push(1);
	heap.push(9);
	heap.push(3);
	// BinaryHeapはmax-heapなので大きい順に出てくる
	assert_eq!(heap.pop(), Some(9));
	assert_eq!(heap.pop(), Some(3));
	assert_eq!(heap.pop(), Some(1));
}

#[test]
fn test_binary_heap_order_min() {
	let mut heap = BinaryHeap::new();
	heap.push(-1);
	heap.push(-9);
	heap.push(-3);
	assert_eq!(-heap.pop().unwrap(), 1);
	assert_eq!(-heap.pop().unwrap(), 3);
	assert_eq!(-heap.pop().unwrap(), 9);
}

#[test]
fn test_binary_heap_with_reverse_key() {
	let mut heap = BinaryHeap::new();
	heap.push(Reverse(42));
	heap.push(Reverse(2));
	heap.push(Reverse(15));
	println!("current heap: {:?}", heap);
	assert_eq!(heap.pop().unwrap().0, 2);
	println!("after heap: {:?}", heap);
	
}

#[test]
fn heap_extend_with_vec() {
	let mut heap = BinaryHeap::new();
	heap.push(3);
	heap.push(9);
	println!("{:?}", heap);
	let v = vec![1, 4, 13];
	heap.extend(v);
	println!("{:?}", heap);
	assert_eq!(heap.pop(), Some(13));
	assert_eq!(heap.pop(), Some(9));
	assert_eq!(heap.pop(), Some(4));
	println!("{:?}", heap);
}