use core::fmt;


#[test]
fn bit_operation_sample() {
	let test = 10_u64.pow(18);
	println!("{:b}", test);
	println!("{}", test.count_zeros());
	println!("{}", test.count_ones());
	let s = String::from(format!("{:b}", test));
	println!("{} len={}", s, s.len());
	let a = s.chars().map(|c| if c == '1' {"BA"} else {"B"}).collect::<String>();
	println!("{}", &a[1..]);
}