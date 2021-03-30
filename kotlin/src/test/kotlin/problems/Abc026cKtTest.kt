class Abc026cKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("5\n" +
                "1\n" +
                "1\n" +
                "1\n" +
                "1", "3"),
            TestData("7\n" +
                "1\n" +
                "1\n" +
                "2\n" +
                "2\n" +
                "3\n" +
                "3", "7\n"),
            TestData("6\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "3\n" +
                "2", "11\n"),
            TestData("10\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "5\n" +
                "6\n" +
                "7\n" +
                "8\n" +
                "9", "1023\n")
        )
    
    override fun callTestTarget() {
        abc026c()
    }
}