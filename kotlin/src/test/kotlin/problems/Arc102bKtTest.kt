class Arc102bKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("4", "8 10\n" +
                "1 2 0\n" +
                "2 3 0\n" +
                "3 4 0\n" +
                "1 5 0\n" +
                "2 6 0\n" +
                "3 7 0\n" +
                "4 8 0\n" +
                "5 6 1\n" +
                "6 7 1\n" +
                "7 8 1\n"),
            TestData("5", "5 7\n" +
                "1 2 0\n" +
                "2 3 1\n" +
                "3 4 0\n" +
                "4 5 0\n" +
                "2 4 0\n" +
                "1 3 3\n" +
                "3 5 1"),
            TestData("113", "aa")
        )
    
    override fun callTestTarget() {
        arc102b()
    }
}