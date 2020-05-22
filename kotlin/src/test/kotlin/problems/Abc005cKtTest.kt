class Abc005cKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("1\n" +
                "3\n" +
                "1 2 3\n" +
                "3\n" +
                "2 3 4", "yes\n"),
            TestData("1\n" +
                "3\n" +
                "1 2 3\n" +
                "3\n" +
                "2 3 5", "no\n"),
            TestData("1\n" +
                "3\n" +
                "1 2 3\n" +
                "10\n" +
                "1 2 3 4 5 6 7 8 9 10", "no\n"),
            TestData("1\n" +
                "3\n" +
                "1 2 3\n" +
                "3\n" +
                "1 2 2", "no\n"),
            TestData("2\n" +
                "5\n" +
                "1 3 6 10 15\n" +
                "3\n" +
                "4 8 16", "yes\n")
        )
    
    override fun callTestTarget() {
        abc005c()
    }
}