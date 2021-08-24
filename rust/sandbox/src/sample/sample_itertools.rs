use itertools::Itertools;

#[test]
fn sample_permutations() {
    let origin = vec!['a', 'a', 'c'];
    for v in origin.into_iter().permutations(3).unique() {
        println!("sorted: {:?}", v);
    }
    let other = vec![1, 5, 0];
    for v in other.into_iter().permutations(3).unique() {
        println!("not sorted: {:?}", v);
    }
}
