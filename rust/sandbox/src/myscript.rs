fn myscript() {
	println!("this is in sandbox.rs");
}

#[cfg(test)]
mod tests {
	#[test]
	fn it_works() {
		assert_eq!(2 + 1, 3);
	}
}