class Divelta2019_2bKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("2\n" +
                "1 1\n" +
                "2 2", "1\n"),
            TestData("3\n" +
                "1 4\n" +
                "4 6\n" +
                "7 8", "1"),
            TestData("4\n" +
                "1 1\n" +
                "1 2\n" +
                "2 1\n" +
                "2 2", "2"),
            TestData("4\n" +
                "1 4\n" +
                "4 6\n" +
                "7 8\n" +
                "30 34", "2")
        )
    
    override fun callTestTarget() {
        divelta2019_2b()
    }
}