use std::collections::BinaryHeap;

#[derive(Debug, Eq, PartialEq)]
struct Test {
	a: usize,
	b: usize,
	cost: i64,
}

impl Ord for Test {
	fn cmp(&self, other: &Self) -> std::cmp::Ordering {
		// otherから比較してるのはBinaryHeapに入れたとき小さい方が前にくるようにするため
		other.cost.cmp(&self.cost)
		// self.cost.cmp(&other.cost)
	}
}

impl PartialOrd for Test {
    fn partial_cmp(&self, other: &Self) -> Option<std::cmp::Ordering> {
	Some(other.cost.cmp(&self.cost))
        // Some(self.cost.cmp(&other.cost))
    }
}

#[test]
fn struct_ordering() {
	let a = Test {
		a: 1,
		b: 1,
		cost: 10,
	};
	let b = Test {
		a: 2,
		b: 3,
		cost: 3,
	};
	println!("{:?}", a);
	println!("eq? {}", a == b);
	println!("eq? {}", a == Test{ a: 1, b:1, cost: 10});
	let mut heap = BinaryHeap::new();
	heap.push(a);
	heap.push(b);
	println!("{:?}", heap);
}
