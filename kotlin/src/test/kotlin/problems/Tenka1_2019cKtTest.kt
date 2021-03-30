class Tenka1_2019cKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("3\n" +
                "#.#", "1\n"),
            TestData("5\n" +
                "#.##.", "2"),
            TestData("9\n" +
                ".........", "0"),
            TestData("12\n.#..#.##.#.#", "4"),
            TestData("6\n..#..#", "1"),
            TestData("15\n.#..##..#..#.##", "5"),
            TestData("6\n.##.##.", "2")
        )
    
    override fun callTestTarget() {
        tenka1_2019c()
    }
}