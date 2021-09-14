use std::collections::{BTreeSet, HashMap};

#[test]
fn insert_into_map() {
	let mut map: HashMap<usize, BTreeSet<u64>> = HashMap::new();
	println!("{:?}", map);
	map.entry(8).or_insert(BTreeSet::new());
	println!("{:?}", map);
	map.get_mut(&8).unwrap().insert(4);
	map.get_mut(&8).unwrap().insert(1);
	map.get_mut(&8).unwrap().insert(2);
	map.entry(8).or_insert(BTreeSet::new());
	println!("{:?}", map);
	println!("{:?}", map[&8].range(2+1..));
}

#[test]
fn check_entry() {
	let mut map = HashMap::new();
	map.insert(1, "1");
	let e = map.entry(1);
	println!("{:?}", e);
	let e = map.entry(2);
	println!("{:?}", e);
}