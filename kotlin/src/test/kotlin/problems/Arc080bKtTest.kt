class Arc080bKtTest : BaseTest() {
    override val testData: List<TestData> = listOf(
        TestData("2 2\n" +
            "3\n" +
            "2 1 1", "1 1\n" +
            "2 3\n"),
        TestData("3 5\n" +
            "5\n" +
            "1 2 3 4 5", "1 4 4 4 3\n" +
            "2 5 4 5 3\n" +
            "2 5 5 5 3"),
        TestData("1 1\n" +
            "1\n" +
            "1", "1\n")
    )
    
    override fun callTestTarget() {
        arc080b()
    }
}