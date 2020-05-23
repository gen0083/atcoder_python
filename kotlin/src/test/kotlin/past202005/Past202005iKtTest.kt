class Past202005iKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("2\n" +
                "19\n" +
                "4 1 1\n" +
                "4 1 2\n" +
                "4 2 1\n" +
                "4 2 2\n" +
                "3\n" +
                "4 1 1\n" +
                "4 1 2\n" +
                "4 2 1\n" +
                "4 2 2\n" +
                "1 1 2\n" +
                "4 1 1\n" +
                "4 1 2\n" +
                "4 2 1\n" +
                "4 2 2\n" +
                "2 2 1\n" +
                "4 1 1\n" +
                "4 1 2\n" +
                "4 2 1\n" +
                "4 2 2", "0\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "0\n" +
                "2\n" +
                "1\n" +
                "3\n" +
                "1\n" +
                "3\n" +
                "0\n" +
                "2\n" +
                "3\n" +
                "1\n" +
                "2\n" +
                "0\n"),
            TestData("3\n" +
                "9\n" +
                "2 2 3\n" +
                "3\n" +
                "1 2 1\n" +
                "2 3 2\n" +
                "1 1 3\n" +
                "3\n" +
                "4 1 1\n" +
                "4 2 2\n" +
                "4 2 3", "1\n" +
                "6\n" +
                "8")
        )
    
    override fun callTestTarget() {
        past202005i()
    }
}