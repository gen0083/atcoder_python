class Abc075cKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("7 7\n" +
                "1 3\n" +
                "2 7\n" +
                "3 4\n" +
                "4 5\n" +
                "4 6\n" +
                "5 6\n" +
                "6 7", "4\n"),
            TestData("3 3\n" +
                "1 2\n" +
                "1 3\n" +
                "2 3", "0\n"),
            TestData("6 5\n" +
                "1 2\n" +
                "2 3\n" +
                "3 4\n" +
                "4 5\n" +
                "5 6", "5\n"),
            TestData("""6 7
                |1 2
                |1 3
                |2 3
                |3 4
                |4 5
                |5 6
                |4 6
            """.trimMargin(), "1"),
            TestData("""7 8
                |1 2
                |2 3
                |3 4
                |1 4
                |1 7
                |4 5
                |5 6
                |6 7
            """.trimMargin(), "0")
        )
    
    override fun callTestTarget() {
        abc075c()
    }
}