class Agc011bKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("3\n" +
                "3 1 4", "2\n"),
            TestData("5\n" +
                "1 1 1 1 1", "5\n"),
            TestData("6\n" +
                "40 1 30 2 7 20", "4"),
            TestData("4\n3 1 100 2", "1")
        )
    
    override fun callTestTarget() {
        agc011b()
    }
}