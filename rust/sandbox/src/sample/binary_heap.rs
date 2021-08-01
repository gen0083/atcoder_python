use std::collections::BinaryHeap;


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