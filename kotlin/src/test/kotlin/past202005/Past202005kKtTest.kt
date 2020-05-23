class Past202005kKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("3 4\n" +
                "1 2 1\n" +
                "2 3 2\n" +
                "3 1 3\n" +
                "1 3 2", "3\n" +
                "3\n" +
                "1\n"),
            TestData("10 20\n" +
                "3 6 3\n" +
                "6 5 6\n" +
                "10 8 10\n" +
                "5 7 3\n" +
                "1 3 1\n" +
                "4 10 4\n" +
                "5 4 6\n" +
                "10 7 4\n" +
                "7 9 3\n" +
                "9 8 4\n" +
                "8 1 4\n" +
                "3 7 1\n" +
                "2 3 2\n" +
                "9 8 3\n" +
                "8 1 10\n" +
                "8 2 8\n" +
                "9 10 9\n" +
                "2 1 8\n" +
                "4 9 6\n" +
                "1 7 4", "7\n" +
                "3\n" +
                "7\n" +
                "7\n" +
                "5\n" +
                "9\n" +
                "7\n" +
                "7\n" +
                "10\n" +
                "7")
        )
    
    override fun callTestTarget() {
        past202005k()
    }
}