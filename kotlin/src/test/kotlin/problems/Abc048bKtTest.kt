class Abc048bKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("4 8 2", "3\n"),
            TestData("0 5 1", "6\n"),
            TestData("9 9 2", "0\n"),
            TestData("1 1000000000000000000 3", "333333333333333333\n"),
            TestData("1 1000000000000000000 1", "1000000000000000000"),
            TestData("1 5 3", "1"),
            TestData("2 4 3", "1"),
            TestData("2 4 100", "0")
        )
    
    override fun callTestTarget() {
        abc048b()
    }
}