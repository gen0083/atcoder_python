use std::collections::{BTreeSet, HashSet};

#[test]
fn set_iterator() {
	let test: HashSet<_> = [1, 2, 3, 2, 3, 6].iter().clone().collect();
	println!("{:?}", test);
	for i in test {
		println!("for: {}", i);
	}
	// HashSetの値の並びは実行するたびに違う＝おそらく不定
	// 昇順に並んでいる可能性もあるけれど、絶対ではない
	let mut test = HashSet::new();
	test.insert(1);
	test.insert(3);
	test.insert(2);
	test.insert(3);
	println!("{:?}", test);
	for i in test {
		println!("for: {}", i);
	}
}

#[test]
fn btreeset_iterator() {
	// BTreeSetを使うとユニークかつ要素が順番に並んだ状態になる
	let test: BTreeSet<_> = [1, 2, 3, 2, 3, 6].iter().clone().collect();
	println!("{:?}", test);
	for i in test {
		println!("for: {}", i);
	}
	let mut test = BTreeSet::new();
	test.insert(1);
	test.insert(3);
	test.insert(2);
	test.insert(3);
	println!("{:?}", test);
	for i in test {
		println!("for: {}", i);
	}
}

#[test]
fn btreeset_range_sample() {
	let mut tree = BTreeSet::new();
	tree.insert(5);
	tree.insert(2);
	tree.insert(3);
	tree.insert(10);
	tree.insert(9);
	println!("{:?}", tree);
	let l = tree.range(0..7);
	// Range { iter: [(2, ()), (3, ()), (5, ())] }
	// RangeはBTreeSet.rangeの戻り値のstruct
	// 中身はiterでさらにややこしく見えるが、iterなのでOptionで返ってきている
	// toupleで表示されているが左側はSome(x)の値、（つまりその値があるよってこと）
	// 重要なのはOptionで値が返ってきているということ
	// ただfor inで使う分にはOptionを意識する必要はない
	println!("{:?}", l);
	let r = tree.range(7..);
	println!("{:?}", r);
	
}