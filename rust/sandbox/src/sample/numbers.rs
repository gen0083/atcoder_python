// https://stackoverflow.com/questions/21747136/how-do-i-print-the-type-of-a-variable-in-rust
fn print_type_of<T: std::fmt::Debug>(t: &T) {
	println!("value: {:?} / type: {}", t, std::any::type_name::<T>());
}

#[test]
fn int_float() {
	let i = 10;
	print_type_of(&i);
	let f = i as f32;
	print_type_of(&f);
	let log = (10.0_f64).powf(18.).log2();
	print_type_of(&log);
	let log_i = log as i64;
	print_type_of(&log_i);
}

#[test]
fn float_to_int() {
	print_type_of(&(10.99 as i32));
	print_type_of(&(10.001 as i32));
	print_type_of(&(10.05_f32.floor() as i32));
	print_type_of(&(576460752303423487_f64.log2()));
	let mut i = 2_i64;
	let mut count = 1;
	let lim = 576460752303423487_i64;
	while i <= lim {
		i*=2;
		count+=1;
	}
	println!("{}", count - 1);
}