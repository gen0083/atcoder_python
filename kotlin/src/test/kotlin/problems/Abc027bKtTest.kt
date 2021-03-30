class Abc027bKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("3\n" +
                "1 2 3", "2\n"),
            TestData("5\n" +
                "2 0 0 0 3", "3\n"),
            TestData("2\n" +
                "0 99", "-1\n"),
            TestData("4\n" +
                "0 0 0 0", "0\n")
        )
    
    override fun callTestTarget() {
        abc027b()
    }
}