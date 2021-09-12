// https://doc.rust-lang.org/std/vec/struct.Vec.html#method.binary_search

#[test]
fn test_binary_search() {
	let mut list = vec![1, 9, 3, 2, 2, 3, 6, 9, 16, 8, 2];
	let a = list.binary_search(&2);
	println!("binary_seach before sorting: {:?}", a);
	list.sort();
	let a = list.binary_search(&2);
	println!("binary_search after sorting: {:?}", a);
	// Result<usize, usize>が返ってくる
	// 当然ながらソートされてないと正常な結果は得られない
	// 返ってくるのはリスト内で指定された要素が何番目の位置にあるかというインデックス
	// 指定した要素がリスト内にない場合はErrで返ってくる
	// Errの場合は指定した要素が挿入されるべき位置が得られる
	// 指定した要素が見つかった場合はOkが返ってくる
	// ただし重複した要素の場合は複数ある要素のうちどのindexが返ってくるかは不明
	//（重複した要素の一番最初のindexが返ってくるとは限らない）
}

#[test]
fn test_insert_position_with_binary_search() {
	let list = vec![1, 3, 5, 7, 9];
	let p = list.binary_search(&4);
	println!("{:?}", p);
	assert_eq!(p, Err(2));
	// 4が挿入されるべき位置として2が返ってくる
}

#[test]
fn test_insert_position_with_binary_search_desc() {
	let list = vec![9, 7, 5, 3, 1];
	let p = list.binary_search_by(|t| 3.cmp(t));
	println!("{:?}", p);
	assert_eq!(p, Ok(3));
	let p = list.binary_search_by(|t| 4.cmp(t));
	println!("{:?}", p);
	assert_eq!(p, Err(3));
	// binary_searchでは昇順に並んでいることが前提になっているっぽい？
	// 降順に並んでいる場合はbinary_search_byを使って比較方法を指定すれば想定通りの動きをする
}

#[test]
fn insert_item() {
	let mut list = vec![2, 4, 6, 8, 10];
	let p = list.binary_search(&5);
	println!("{:?}", p);
	assert_eq!(p, Err(2));
	if let Err(i) = p {
		list.insert(i, 5);
		println!("{:?}", list);
	}
}
